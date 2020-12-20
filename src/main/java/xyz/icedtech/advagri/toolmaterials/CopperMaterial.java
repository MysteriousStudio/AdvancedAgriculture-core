package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class CopperMaterial extends AdvAgriToolMaterials {

    public static final CopperMaterial INSTANCE = new CopperMaterial();

    public CopperMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().COPPER_INGOT);
    }
}
