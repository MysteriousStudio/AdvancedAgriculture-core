package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class SilverMaterial extends AdvAgriToolMaterials {

    public static final SilverMaterial INSTANCE = new SilverMaterial();

    public SilverMaterial() {
        super.setDurability(280);
        super.setMiningSpeedMultiplier(5F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(12);
        super.setIngredient(AdvAgriItems.SILVER_INGOT);
    }
}
