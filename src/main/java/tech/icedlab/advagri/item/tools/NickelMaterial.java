package tech.icedlab.advagri.item.tools;

import tech.icedlab.advagri.item.AdvAgriItems;

public class NickelMaterial extends AdvAgriToolMaterials {

    public static final NickelMaterial INSTANCE = new NickelMaterial();

    public NickelMaterial() {
        super.setDurability(230);
        super.setMiningSpeedMultiplier(6F);
        super.setAttackDamage(2F);
        super.setMineLevel(2);
        super.setEnchantability(8);
        super.setIngredient(AdvAgriItems.getInstance().NICKEL_INGOT);
    }
}
