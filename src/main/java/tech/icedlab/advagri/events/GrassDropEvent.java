package tech.icedlab.advagri.events;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;


public class GrassDropEvent implements EventInterface {
    private static final GrassDropEvent GRASS_DROP_EVENT = new GrassDropEvent();

    private GrassDropEvent() {

    }

    public static GrassDropEvent getInstance() {
        return GRASS_DROP_EVENT;
    }

    @Override
    public void Init() {

        //Todo: 1/18/21 1:01 PM
        // User: suibing
        // Aims: For getting bamboo from grass, only can take the bamboo from BREAKING grass by hand. Not any plan to add some way to get bamboo by using water to get the bamboo.
        // Desc: The new way to get bamboo.
        // Stat: True

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {

            final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/grass");
            final Identifier TALL_GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/tall_grass");
            final Identifier FERN_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/fern");
            final Identifier LARGE_FERN_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/large_fern");

            if (GRASS_LOOT_TABLE_ID.equals(id) || TALL_GRASS_LOOT_TABLE_ID.equals(id) || FERN_LOOT_TABLE_ID.equals(id) || LARGE_FERN_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.01F).build())
                        .withEntry(ItemEntry.builder(Items.BAMBOO)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });

    }
}
