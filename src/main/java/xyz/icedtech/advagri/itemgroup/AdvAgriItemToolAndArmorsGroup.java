package xyz.icedtech.advagri.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.icedtech.advagri.item.ArmorItems;

public class AdvAgriItemArmorsGroup {
    private static final AdvAgriItemArmorsGroup advAgriItemArmorsGroup = new AdvAgriItemArmorsGroup();

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("adv_agri_core", "agriculture_armors"),
            () -> new ItemStack(ArmorItems.getInstance().BAMBOO_HELMET));

    private AdvAgriItemArmorsGroup() {

    }

    public static AdvAgriItemArmorsGroup getInstance() {
        return advAgriItemArmorsGroup;
    }

    public ItemGroup GetGroup(){
        return ITEM_GROUP;
    }
}
