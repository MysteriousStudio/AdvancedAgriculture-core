package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class SilverMaterial extends AdvAgriToolMaterials {

    public static final SilverMaterial INSTANCE = new SilverMaterial();

    public SilverMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().SILVER_INGOT);
    }
}
