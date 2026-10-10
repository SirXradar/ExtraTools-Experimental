package me.sfiguz7.extratools.implementation.tools;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.DamageableItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import java.util.List;

public class Hammer extends SimpleSlimefunItem<ToolUseHandler> implements DamageableItem {

    public Hammer(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public ToolUseHandler getItemHandler() {
        return this::onToolUse;
    }

    private void onToolUse(BlockBreakEvent e, ItemStack item, int slot, List<ItemStack> drops) {
        Block b = e.getBlock();
        Material type = b.getType();

        if (type == Material.STONE) {
            drops.clear();
            drops.add(new ItemStack(Material.COBBLESTONE));
        } else if (type == Material.STONE_BRICKS) {
            drops.clear();
            drops.add(new ItemStack(Material.CRACKED_STONE_BRICKS));
        } else if (type == Material.COBBLESTONE) {
            drops.clear();
            drops.add(new ItemStack(Material.SAND));
        }

        Player p = e.getPlayer();
        damageItem(p, item);
    }

}
