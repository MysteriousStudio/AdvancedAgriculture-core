package xyz.icedtech.advagri.block;

import net.minecraft.block.Block;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class AdvancedCraftingTable extends Block {
    private static final Text TITLE = new TranslatableText("title.advanced_crafting_table");

    public AdvancedCraftingTable(Settings settings) {
        super(settings);
    }
}
