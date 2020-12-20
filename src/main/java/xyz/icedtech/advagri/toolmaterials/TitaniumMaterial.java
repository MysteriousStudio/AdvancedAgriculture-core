package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class TitaniumMaterial extends AdvAgriToolMaterials {

    public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

    public TitaniumMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().TITANIUM_INGOT);
    }
}
