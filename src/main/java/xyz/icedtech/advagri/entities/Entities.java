package xyz.icedtech.advagri.entities;


import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;

public class Entities {
    public static Entities entities = new Entities();

    public EntityType FIRECRACKER_ENTITY;


    public void InitAllEntity() {

        FIRECRACKER_ENTITY = Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier(ModAta.ModEntityNamespace, "firecracker_entity"),
                FabricEntityTypeBuilder.create(SpawnGroup.MISC, FirecrackerEntity::new).build()
        );
    }


    private Entities() {
    }


    public static Entities getInstance() {
        return entities;
    }
}
