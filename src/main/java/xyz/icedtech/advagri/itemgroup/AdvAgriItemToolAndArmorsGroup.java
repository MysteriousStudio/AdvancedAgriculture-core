package xyz.icedtech.advagri.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.icedtech.advagri.item.AdvAgriArmorItems;

public class AdvAgriItemToolAndArmorsGroup {
    private static final AdvAgriItemToolAndArmorsGroup ADV_AGRI_ITEM_TOOL_AND_ARMORS_GROUP = new AdvAgriItemToolAndArmorsGroup();

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("adv_agri_core", "agriculture_tool_and_armors"),
            () -> new ItemStack(AdvAgriArmorItems.getInstance().BAMBOO_HELMET));

    private AdvAgriItemToolAndArmorsGroup() {

    }

    public static AdvAgriItemToolAndArmorsGroup getInstance() {
        return ADV_AGRI_ITEM_TOOL_AND_ARMORS_GROUP;
    }

    public ItemGroup GetGroup() {
        return ITEM_GROUP;
    }
}
