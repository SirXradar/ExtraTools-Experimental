package me.sfiguz7.extratools;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.sfiguz7.extratools.implementation.machines.CobblestoneGenerator;
import me.sfiguz7.extratools.implementation.machines.ConcreteFactory;
import me.sfiguz7.extratools.implementation.machines.ElectricComposter;
import me.sfiguz7.extratools.implementation.machines.GoldTransmuter;
import me.sfiguz7.extratools.implementation.machines.Pulverizer;
import me.sfiguz7.extratools.implementation.machines.Vaporizer;
import me.sfiguz7.extratools.implementation.tools.Hammer;
import me.sfiguz7.extratools.lists.ETItems;
import io.github.mooy1.infinitylib.core.AbstractAddon;
import org.bstats.bukkit.Metrics;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class ExtraTools extends AbstractAddon {

    private static ExtraTools instance;
    private int researchId = 4100;

    public ExtraTools() {
        super("Sfiguz7", "ExtraTools", "master", "options.auto-update");
    }

    @Override
    public void enable() {
        instance = this;

        new Metrics(this, 6945);

        ItemGroup category = new ItemGroup(new NamespacedKey(this, "extra_tools"), CustomItemStack.create(Material.DIAMOND_AXE, "&4Extra Tools"));

        ItemStack[] hammerRecipe = new ItemStack[] {
            null, SlimefunItems.STEEL_INGOT.item(), null,
            SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.IRON_PICKAXE), SlimefunItems.STEEL_INGOT.item(),
            null, SlimefunItems.STEEL_INGOT.item(), null
        };
        new Hammer(category, ETItems.HAMMER, RecipeType.ENHANCED_CRAFTING_TABLE, hammerRecipe).register(this);
        new Research(new NamespacedKey(this, "HAMMER"), ++researchId, "Hammer", 3).addItems(ETItems.HAMMER.item()).register();

        new GoldTransmuter(category, ETItems.GOLD_TRANSMUTER).register(this);
        new Research(new NamespacedKey(this, "GOLD_TRANSMUTER"), ++researchId, "Gold Transmuter", 12).addItems(ETItems.GOLD_TRANSMUTER.item()).register();

        new ElectricComposter(ElectricComposter.Tier.ONE, category).register(this);
        new Research(new NamespacedKey(this, "ELECTRIC_COMPOSTER"), ++researchId, "Electric Composter", 18).addItems(ETItems.ELECTRIC_COMPOSTER.item()).register();

        new ElectricComposter(ElectricComposter.Tier.TWO, category).register(this);
        new Research(new NamespacedKey(this, "ELECTRIC_COMPOSTER_2"), ++researchId, "Electric Composter II", 18).addItems(ETItems.ELECTRIC_COMPOSTER_2.item()).register();

        new CobblestoneGenerator(category, ETItems.COBBLESTONE_GENERATOR).register(this);
        new Research(new NamespacedKey(this, "COBBLESTONE_GENERATOR"), ++researchId, "Cobblestone Generator", 40).addItems(ETItems.COBBLESTONE_GENERATOR.item()).register();

        new Vaporizer(category, ETItems.VAPORIZER).register(this);
        new Research(new NamespacedKey(this, "VAPORIZER"), ++researchId, "Vaporizer", 18).addItems(ETItems.VAPORIZER.item()).register();

        new ConcreteFactory(category, ETItems.CONCRETE_FACTORY).register(this);
        new Research(new NamespacedKey(this, "CONCRETE_FACTORY"), ++researchId, "Concrete Factory", 12).addItems(ETItems.CONCRETE_FACTORY.item()).register();

        new Pulverizer(category, ETItems.PULVERIZER).register(this);
        new Research(new NamespacedKey(this, "PULVERIZER"), ++researchId, "Pulverizer", 18).addItems(ETItems.PULVERIZER.item()).register();
    }

    @Override
    public void disable() {
    }

    public static ExtraTools getInstance() {
        return instance;
    }

}
