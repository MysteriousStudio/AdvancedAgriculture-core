package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class BronzeMaterial extends AdvAgriToolMaterials {
    public static final BronzeMaterial INSTANCE = new BronzeMaterial();

    public BronzeMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().BRONZE_INGOT);
    }
}
