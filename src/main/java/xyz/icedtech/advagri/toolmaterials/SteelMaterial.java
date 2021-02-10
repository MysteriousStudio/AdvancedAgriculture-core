package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class SteelMaterial extends AdvAgriToolMaterials {

    public final static SteelMaterial INSTANCE = new SteelMaterial();

    public SteelMaterial() {
        super.setDurability(560);
        super.setMiningSpeedMultiplier(6F);
        super.setAttackDamage(2F);
        super.setMineLevel(2);
        super.setEnchantability(9);
        super.setIngredient(AdvAgriItems.STEEL_INGOT);
    }
}
