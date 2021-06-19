package tech.icedlab.advagri.item.tools;

import tech.icedlab.advagri.item.AdvAgriItems;

public class CopperMaterial extends AdvAgriToolMaterials {

    public static final CopperMaterial INSTANCE = new CopperMaterial();

    public CopperMaterial() {
        super.setDurability(250);
        super.setMiningSpeedMultiplier(6F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(8);
        super.setIngredient(AdvAgriItems.getInstance().COPPER_INGOT);
    }
}
