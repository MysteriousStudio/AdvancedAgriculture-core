package tech.icedlab.advagri.item.tools;

import tech.icedlab.advagri.item.AdvAgriItems;

public class LeadMaterial extends AdvAgriToolMaterials {

    public static final LeadMaterial INSTANCE = new LeadMaterial();

    public LeadMaterial() {
        super.setDurability(100);
        super.setMiningSpeedMultiplier(3F);
        super.setAttackDamage(2F);
        super.setMineLevel(1);
        super.setEnchantability(6);
        super.setIngredient(AdvAgriItems.getInstance().LEAD_INGOT);
    }

}
