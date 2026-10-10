package me.sfiguz7.extratools.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.sfiguz7.extratools.lists.ETItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricComposter extends AContainer implements RecipeDisplayItem {

    public enum Tier {
        ONE(1, 9, ETItems.ELECTRIC_COMPOSTER),
        TWO(4, 25, ETItems.ELECTRIC_COMPOSTER_2);

        private final int speed;
        private final int energyConsumption;
        private final SlimefunItemStack item;

        Tier(int speed, int energyConsumption, SlimefunItemStack item) {
            this.speed = speed;
            this.energyConsumption = energyConsumption;
            this.item = item;
        }

        public int getSpeed() {
            return speed;
        }

        public int getEnergyConsumption() {
            return energyConsumption;
        }

        public SlimefunItemStack getItem() {
            return item;
        }
    }

    private final Tier tier;

    public ElectricComposter(Tier tier, ItemGroup itemGroup) {
        super(itemGroup, tier.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.HOPPER), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(Material.DIRT), SlimefunItems.SMALL_CAPACITOR.item(), new ItemStack(Material.BONE_MEAL),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.BROWN_MUSHROOM), SlimefunItems.STEEL_INGOT.item()
        });
        this.tier = tier;
    }

    @Override
    public String getMachineIdentifier() {
        return "ELECTRIC_COMPOSTER_" + tier.name();
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BONE_MEAL);
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return tier.getEnergyConsumption();
    }

    @Override
    public int getSpeed() {
        return tier.getSpeed();
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(30 / getSpeed(), SlimefunItems.WHEAT_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.WHEAT_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.CARROT_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.CARROT_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.POTATO_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.POTATO_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.SEEDS_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.SEEDS_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.BEETROOT_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.BEETROOT_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.MELON_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.MELON_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.APPLE_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.APPLE_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.SWEET_BERRIES_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.SWEET_BERRIES_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.KELP_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.KELP_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.COCOA_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.COCOA_FERTILIZER, 2));
        this.registerRecipe(30 / getSpeed(), SlimefunItems.SEAGRASS_ORGANIC_FOOD, new SlimefunItemStack(SlimefunItems.SEAGRASS_FERTILIZER, 2));
    }
}
