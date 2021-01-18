package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class AluminiumMaterial extends AdvAgriToolMaterials {

    public static final AluminiumMaterial INSTANCE = new AluminiumMaterial();

    public AluminiumMaterial() {
        super.setDurability(80);
        super.setMiningSpeedMultiplier(10F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(22);
        super.setIngredient(AdvAgriItems.getInstance().ALUMINIUM_INGOT);
    }

}
