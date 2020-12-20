package xyz.icedtech.advagri.toolmaterials;

import xyz.icedtech.advagri.item.AdvAgriItems;

public class LeadMaterial extends AdvAgriToolMaterials {

    public static final LeadMaterial INSTANCE=new LeadMaterial();

    public LeadMaterial() {
        super.setDurability(0);
        super.setMiningSpeedMultiplier(0F);
        super.setAttackDamage(0F);
        super.setMineLevel(0);
        super.setEnchantability(0);
        super.setIngredient(AdvAgriItems.getInstance().LEAD_INGOT);
    }

}
