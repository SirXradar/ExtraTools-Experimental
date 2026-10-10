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

public class Pulverizer extends AContainer implements RecipeDisplayItem, NotHopperable {

    public Pulverizer(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.IRON_PICKAXE), SlimefunItems.STEEL_INGOT.item(),
                SlimefunItems.ELECTRIC_MOTOR.item(), SlimefunItems.SMALL_CAPACITOR.item(), SlimefunItems.ELECTRIC_MOTOR.item(),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.REDSTONE), SlimefunItems.STEEL_INGOT.item()
        });
        this.setCapacity(256);
        this.setProcessingSpeed(1);
        this.setEnergyConsumption(18);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.IRON_PICKAXE);
    }

    @Override
    public String getMachineIdentifier() {
        return "PULVERIZER";
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
        this.registerRecipe(6, new ItemStack(Material.IRON_INGOT), SlimefunItems.STEEL_INGOT.item());
        this.registerRecipe(6, new ItemStack(Material.GOLD_INGOT), new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 2).item());
        this.registerRecipe(6, new ItemStack(Material.SANDSTONE), new ItemStack(Material.SAND, 4));
        this.registerRecipe(6, new ItemStack(Material.STONE), new ItemStack(Material.COBBLESTONE, 2));
        this.registerRecipe(6, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.COBBLESTONE, 8));
        this.registerRecipe(6, new ItemStack(Material.END_STONE), new ItemStack(Material.OBSIDIAN, 2));
    }
}
