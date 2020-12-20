package xyz.icedtech.advagri.toolmaterials;


import xyz.icedtech.advagri.item.AdvAgriItems;

public class AluminiumMaterial extends AdvAgriToolMaterials {

    public static final AluminiumMaterial INSTANCE = new AluminiumMaterial();

    public AluminiumMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().ALUMINIUM_INGOT);
    }

}
