package xyz.icedtech.advagri;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import xyz.icedtech.advagri.block.Blocks;
import xyz.icedtech.advagri.item.Items;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemGroup;

public class AdvancedAgriculture implements ModInitializer {
    @Override
    public void onInitialize() {
        ItemGroup ig = AdvAgriItemGroup.getInstance().GetGroup();
        Items items = new Items(ig);
        Blocks blocks = new Blocks(ig);
    }
}
