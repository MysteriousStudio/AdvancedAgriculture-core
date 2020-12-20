package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class ZincMaterial extends AdvAgriToolMaterials {

    public static final ZincMaterial INSTANCE = new ZincMaterial();

    public ZincMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().ZINC_INGOT);
    }
}
