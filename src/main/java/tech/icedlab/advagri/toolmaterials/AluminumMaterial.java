package tech.icedlab.advagri.toolmaterials;

import tech.icedlab.advagri.item.AdvAgriItems;

public class AluminumMaterial extends AdvAgriToolMaterials {

    public static final AluminumMaterial INSTANCE = new AluminumMaterial();

    public AluminumMaterial() {
        super.setDurability(80);
        super.setMiningSpeedMultiplier(10F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(22);
        super.setIngredient(AdvAgriItems.ALUMINUM_INGOT);
    }

}
