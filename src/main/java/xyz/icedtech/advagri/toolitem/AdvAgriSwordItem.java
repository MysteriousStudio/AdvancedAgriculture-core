package xyz.icedtech.advagri.toolitem;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class AdvAgriSwordItem extends SwordItem {
    public AdvAgriSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
