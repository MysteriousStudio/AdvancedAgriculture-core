package xyz.icedtech.advagri.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class AdvAgriItemCoreGroup {
    private static final AdvAgriItemCoreGroup advAgriItemCoreGroup = new AdvAgriItemCoreGroup();

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("adv_agri_core", "agriculture"),
            () -> new ItemStack(Items.BAMBOO));

    private AdvAgriItemCoreGroup() {

    }

    public static AdvAgriItemCoreGroup getInstance() {
        return advAgriItemCoreGroup;
    }

    public ItemGroup GetGroup(){
        return ITEM_GROUP;
    }
}
