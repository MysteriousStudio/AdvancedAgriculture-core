package tech.icedlab.advagri.item.tools;

import tech.icedlab.advagri.item.AdvAgriItems;

public class TinMaterial extends AdvAgriToolMaterials {

    public final static TinMaterial INSTANCE = new TinMaterial();

    public TinMaterial() {
        super.setDurability(150);
        super.setMiningSpeedMultiplier(5F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(6);
        super.setIngredient(AdvAgriItems.getInstance().TIN_INGOT);
    }
}
