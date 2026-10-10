package me.sfiguz7.extratools.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Vaporizer extends AContainer implements RecipeDisplayItem, NotHopperable {

    public Vaporizer(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.REDSTONE), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(Material.REDSTONE), SlimefunItems.SMALL_CAPACITOR.item(), new ItemStack(Material.REDSTONE),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.REDSTONE), SlimefunItems.STEEL_INGOT.item()
        });
        this.setCapacity(256);
        this.setProcessingSpeed(1);
        this.setEnergyConsumption(32);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.RED_STAINED_GLASS);
    }

    @Override
    public String getMachineIdentifier() {
        return "VAPORIZER";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 32;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(4, new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.GLASS_BOTTLE, 4));
        this.registerRecipe(4, new ItemStack(Material.POTION), new ItemStack(Material.GLASS_BOTTLE, 3));
        this.registerRecipe(4, new ItemStack(Material.SPLASH_POTION), new ItemStack(Material.GLASS_BOTTLE, 2));
        this.registerRecipe(4, new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.OBSIDIAN, 1));
    }
}
