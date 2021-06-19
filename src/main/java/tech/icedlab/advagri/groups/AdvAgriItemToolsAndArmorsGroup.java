package tech.icedlab.advagri.groups;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tech.icedlab.advagri.item.armors.AdvAgriArmors;

public class AdvAgriItemToolsAndArmorsGroup {
    private static final AdvAgriItemToolsAndArmorsGroup ADV_AGRI_ITEM_TOOL_AND_ARMORS_GROUP = new AdvAgriItemToolsAndArmorsGroup();

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("adv_agri_core", "agriculture_tool_and_armors"),
            () -> new ItemStack(AdvAgriArmors.getInstance().BAMBOO_HELMET));

    private AdvAgriItemToolsAndArmorsGroup() {

    }

    public static AdvAgriItemToolsAndArmorsGroup getInstance() {
        return ADV_AGRI_ITEM_TOOL_AND_ARMORS_GROUP;
    }

    public ItemGroup GetGroup() {
        return ITEM_GROUP;
    }
}
