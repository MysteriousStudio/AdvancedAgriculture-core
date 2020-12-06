package xyz.icedtech.advagri.armor_materials;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.recipe.Ingredient;
import xyz.icedtech.advagri.item.Items;

public class LEATHER_BAMBOO_MIXED implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{1, 3, 3, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 5;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 3;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.getInstance().BAMBOO_SILK_BOARD);
    }

    @Override
    public String getName() {
        return "BAMBOO_LEATHER_MIXED";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }}


