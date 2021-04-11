package tech.icedlab.advagri.block.machines;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import tech.icedlab.advagri.entities.block.AdvancedCraftingTableEntity;

public class AdvancedCraftingTable extends Machine implements BlockEntityProvider {
    private static final Text TITLE = new TranslatableText("title.advanced_crafting_table");

    public AdvancedCraftingTable(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new AdvancedCraftingTableEntity();
    }
}
