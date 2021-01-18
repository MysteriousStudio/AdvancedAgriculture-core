package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class TungstenMaterial extends AdvAgriToolMaterials {

    public static final TungstenMaterial INSTANCE = new TungstenMaterial();

    public TungstenMaterial() {
        super.setDurability(2200);
        super.setMiningSpeedMultiplier(6F);
        super.setAttackDamage(2F);
        super.setMineLevel(3);
        super.setEnchantability(9);
        super.setIngredient(AdvAgriItems.getInstance().TUNGSTEN_INGOT);
    }
}
