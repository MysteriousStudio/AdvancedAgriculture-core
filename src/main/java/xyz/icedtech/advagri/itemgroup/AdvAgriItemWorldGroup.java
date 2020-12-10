package xyz.icedtech.advagri.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.icedtech.advagri.block.Blocks;

public class AdvAgriItemWorldGroup {
    private static final AdvAgriItemWorldGroup advAgriItemWorldGroup = new AdvAgriItemWorldGroup();

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("adv_agri_core", "agriculture_world"),
            () -> new ItemStack(Blocks.getInstance().COPPER_ORE));

    private AdvAgriItemWorldGroup() {

    }

    public static AdvAgriItemWorldGroup getInstance() {
        return advAgriItemWorldGroup;
    }

    public ItemGroup GetGroup() {
        return ITEM_GROUP;
    }
}
