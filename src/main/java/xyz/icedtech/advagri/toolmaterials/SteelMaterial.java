package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class SteelMaterial extends AdvAgriToolMaterials {

    public final static SteelMaterial INSTANCE = new SteelMaterial();

    public SteelMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().STEEL_INGOT);
    }
}
