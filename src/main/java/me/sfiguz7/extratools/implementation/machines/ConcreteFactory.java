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

public class ConcreteFactory extends AContainer implements RecipeDisplayItem, NotHopperable {

    public ConcreteFactory(ItemGroup itemGroup, SlimefunItemStack item) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.SAND), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.SMALL_CAPACITOR.item(), new ItemStack(Material.LAVA_BUCKET),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.SAND), SlimefunItems.STEEL_INGOT.item()
        });
        this.setCapacity(256);
        this.setProcessingSpeed(1);
        this.setEnergyConsumption(16);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLACK_CONCRETE_POWDER);
    }

    @Override
    public String getMachineIdentifier() {
        return "CONCRETE_FACTORY";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 16;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(3, new ItemStack(Material.WHITE_CONCRETE_POWDER, 1), new ItemStack(Material.WHITE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.ORANGE_CONCRETE_POWDER, 1), new ItemStack(Material.ORANGE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.MAGENTA_CONCRETE_POWDER, 1), new ItemStack(Material.MAGENTA_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER, 1), new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.YELLOW_CONCRETE_POWDER, 1), new ItemStack(Material.YELLOW_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIME_CONCRETE_POWDER, 1), new ItemStack(Material.LIME_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.PINK_CONCRETE_POWDER, 1), new ItemStack(Material.PINK_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GRAY_CONCRETE_POWDER, 1), new ItemStack(Material.GRAY_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 1), new ItemStack(Material.LIGHT_GRAY_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.CYAN_CONCRETE_POWDER, 1), new ItemStack(Material.CYAN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.PURPLE_CONCRETE_POWDER, 1), new ItemStack(Material.PURPLE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.BLUE_CONCRETE_POWDER, 1), new ItemStack(Material.BLUE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GREEN_CONCRETE_POWDER, 1), new ItemStack(Material.GREEN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.BROWN_CONCRETE_POWDER, 1), new ItemStack(Material.BROWN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GREEN_CONCRETE_POWDER, 1), new ItemStack(Material.GREEN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.RED_CONCRETE_POWDER, 1), new ItemStack(Material.RED_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.BLACK_CONCRETE_POWDER, 1), new ItemStack(Material.BLACK_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.WHITE_TERRACOTTA, 1), new ItemStack(Material.WHITE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.ORANGE_TERRACOTTA, 1), new ItemStack(Material.ORANGE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.MAGENTA_TERRACOTTA, 1), new ItemStack(Material.MAGENTA_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIGHT_BLUE_TERRACOTTA, 1), new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.YELLOW_TERRACOTTA, 1), new ItemStack(Material.YELLOW_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIME_TERRACOTTA, 1), new ItemStack(Material.LIME_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.PINK_TERRACOTTA, 1), new ItemStack(Material.PINK_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GRAY_TERRACOTTA, 1), new ItemStack(Material.GRAY_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.LIGHT_GRAY_TERRACOTTA, 1), new ItemStack(Material.LIGHT_GRAY_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.CYAN_TERRACOTTA, 1), new ItemStack(Material.CYAN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.PURPLE_TERRACOTTA, 1), new ItemStack(Material.PURPLE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.BLUE_TERRACOTTA, 1), new ItemStack(Material.BLUE_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GREEN_TERRACOTTA, 1), new ItemStack(Material.GREEN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.BROWN_TERRACOTTA, 1), new ItemStack(Material.BROWN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.GREEN_TERRACOTTA, 1), new ItemStack(Material.GREEN_CONCRETE, 1));
        this.registerRecipe(3, new ItemStack(Material.RED_TERRACOTTA, 1), new ItemStack(Material.RED_CONCRETE, 1));
    }
}
