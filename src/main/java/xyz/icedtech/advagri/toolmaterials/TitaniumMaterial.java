package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class TitaniumMaterial extends AdvAgriToolMaterials {

    public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

    public TitaniumMaterial() {
        super.setDurability(980);
        super.setMiningSpeedMultiplier(9F);
        super.setAttackDamage(2F);
        super.setMineLevel(3);
        super.setEnchantability(15);
        super.setIngredient(AdvAgriItems.getInstance().TITANIUM_INGOT);
    }
}
