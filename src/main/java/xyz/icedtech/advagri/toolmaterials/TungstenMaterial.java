package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class TungstenMaterial extends AdvAgriToolMaterials {

    public static final TungstenMaterial INSTANCE = new TungstenMaterial();

    public TungstenMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().TUNGSTEN_INGOT);
    }
}
