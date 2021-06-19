package tech.icedlab.advagri.item.tools;

import tech.icedlab.advagri.item.AdvAgriItems;

public class ZincMaterial extends AdvAgriToolMaterials {

    public static final ZincMaterial INSTANCE = new ZincMaterial();

    public ZincMaterial() {
        super.setDurability(150);
        super.setMiningSpeedMultiplier(6F);
        super.setAttackDamage(2F);
        super.setMineLevel(2);
        super.setEnchantability(6);
        super.setIngredient(AdvAgriItems.getInstance().ZINC_INGOT);
    }
}
