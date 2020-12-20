package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class TinMaterial extends AdvAgriToolMaterials {

    public final static TinMaterial INSTANCE = new TinMaterial();

    public TinMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().TIN_INGOT);
    }
}
