package xyz.icedtech.advAgri.agri.tool;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import xyz.icedtech.advAgri.agri.AgriItem;

import java.util.function.Supplier;

public enum AgriMaterial implements ToolMaterial {
    SILVER(2, 100, 11.0F, 5.0F, 19, () -> {
        return Ingredient.ofItems(AgriItem.INSTANCE.getSILVER_INGOT());
    }),
    STEEL(3, 1000, 6.0F, 3.5F, 15, () -> {
        return Ingredient.ofItems(AgriItem.INSTANCE.getSTEEL_INGOT());
    }),
    COPPER(2, 120, 5.0F, 2.5F, 9, () -> {
        return Ingredient.ofItems(AgriItem.INSTANCE.getCOPPER_INGOT());
    }),
    TITANIUM(3, 1000, 6.0F, 3.5F, 15, () -> {
        return Ingredient.ofItems(AgriItem.INSTANCE.getTITANIUM_INGOT());
    }),
    BRONZE(2, 131, 5.5F, 3.0F, 14, () -> {
        return Ingredient.ofItems(AgriItem.INSTANCE.getBRONZE_INGOT());
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantAbility;
    private final Lazy<Ingredient> repairIngredient;

    private AgriMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantAbility = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantAbility;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}
