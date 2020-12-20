package xyz.icedtech.advagri.toolmaterials;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class AdvAgriToolMaterials implements ToolMaterial {
    private Float miningSpeedMultiplier;
    private Integer durability;
    private Float attackDamage;
    private Integer mineLevel;
    private Integer enchantability;
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


    public void setIngredient(Item ingredient) {
        this.ingredient = ingredient;
    }


    public void setDurability(Integer durability) {
        this.durability = durability;
    }


    public void setMiningSpeedMultiplier(Float miningSpeedMultiplier) {
        this.miningSpeedMultiplier = miningSpeedMultiplier;
    }


    public void setAttackDamage(Float attackDamage) {
        this.attackDamage = attackDamage;
    }


    public void setMineLevel(Integer mineLevel) {
        this.mineLevel = mineLevel;
    }


    public void setEnchantability(Integer enchantability) {
        this.enchantability = enchantability;
    }

    public static void setINSTANCE(AdvAgriToolMaterials INSTANCE) {
        AdvAgriToolMaterials.INSTANCE = INSTANCE;
    }

    public  AdvAgriToolMaterials getINSTANCE() {
        return INSTANCE;
    }
}
