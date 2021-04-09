package tech.icedlab.advagri.entities.item;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tech.icedlab.advagri.ModAta;

public class AdvAgriItemEntities {
    public static AdvAgriItemEntities advAgriItemEntities = new AdvAgriItemEntities();

    public EntityType FIRECRACKER_ENTITY;


    public void InitAllItemEntity() {

        FIRECRACKER_ENTITY = Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier(ModAta.ModEntityNamespace, "firecracker_entity"),
                FabricEntityTypeBuilder.create(SpawnGroup.MISC, FirecrackerEntity::new).build()
        );

    }


    private AdvAgriItemEntities() {
    }


    public static AdvAgriItemEntities getInstance() {
        return advAgriItemEntities;
    }
}
