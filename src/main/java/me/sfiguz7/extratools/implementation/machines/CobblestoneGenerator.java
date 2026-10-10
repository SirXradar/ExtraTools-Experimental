package me.sfiguz7.extratools.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CobblestoneGenerator extends AContainer implements RecipeDisplayItem, NotHopperable {

    public CobblestoneGenerator(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), SlimefunItems.STEEL_INGOT.item(), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.SMALL_CAPACITOR.item(), new ItemStack(Material.LAVA_BUCKET),
                new ItemStack(Material.STONE), new ItemStack(Material.PISTON), new ItemStack(Material.STONE)
        });
        this.setCapacity(256);
        this.setProcessingSpeed(1);
        this.setEnergyConsumption(36);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.WATER_BUCKET);
    }

    @Override
    public String getMachineIdentifier() {
        return "COBBLESTONE_GENERATOR";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 36;
    }
}
