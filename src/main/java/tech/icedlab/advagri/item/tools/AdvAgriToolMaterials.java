package tech.icedlab.advagri.item.tools;

import lombok.Setter;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class AdvAgriToolMaterials implements ToolMaterial {
    @Setter
    private Float miningSpeedMultiplier;
    @Setter
    private Integer durability;
    @Setter
    private Float attackDamage;
    @Setter
    private Integer mineLevel;
    @Setter
    private Integer enchantability;
    @Setter
    private Item ingredient;


    public static AdvAgriToolMaterials INSTANCE;


    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return mineLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ingredient);
    }

    public static void setINSTANCE(AdvAgriToolMaterials INSTANCE) {
        AdvAgriToolMaterials.INSTANCE = INSTANCE;
    }

    public AdvAgriToolMaterials getINSTANCE() {
        return INSTANCE;
    }
}
