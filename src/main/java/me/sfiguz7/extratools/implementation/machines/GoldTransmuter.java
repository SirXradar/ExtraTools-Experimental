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

public class GoldTransmuter extends AContainer implements RecipeDisplayItem, NotHopperable {

    public GoldTransmuter(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.GOLD_INGOT), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(Material.GOLD_INGOT), SlimefunItems.SMALL_CAPACITOR.item(), new ItemStack(Material.GOLD_INGOT),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.GOLD_INGOT), SlimefunItems.STEEL_INGOT.item()
        });
        this.setCapacity(256);
        this.setProcessingSpeed(1);
        this.setEnergyConsumption(18);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLD_INGOT);
    }

    @Override
    public String getMachineIdentifier() {
        return "GOLD_TRANSMUTER";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 18;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(5, new ItemStack(Material.IRON_INGOT, 3), SlimefunItems.STEEL_INGOT.item());
        this.registerRecipe(5, new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 3).item(), new ItemStack(Material.GOLD_INGOT, 3));
    }
}
