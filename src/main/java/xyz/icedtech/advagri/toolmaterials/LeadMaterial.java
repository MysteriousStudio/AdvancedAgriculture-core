package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class LeadMaterial extends AdvAgriToolMaterials {

    public static final LeadMaterial INSTANCE = new LeadMaterial();

    public LeadMaterial() {
        super.setDurability(100);
        super.setMiningSpeedMultiplier(3F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(6);
        super.setIngredient(AdvAgriItems.LEAD_INGOT);
    }

}
