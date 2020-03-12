package xyz.icedtech.advAgri.entity

import net.minecraft.block.entity.BlockEntity
import net.minecraft.nbt.CompoundTag
import java.util.function.Supplier

class CropRacksEntity : BlockEntity(CROP_RACKS_ENTITY), Supplier<CropRacksEntity> {

    var level = 0
    var crop = ""
    var using = false

    override fun toTag(tag: CompoundTag?): CompoundTag {
        tag?.putInt("level", level)
        tag?.putString("crop", crop)
        tag?.putBoolean("using", false)
        return super.toTag(tag)
    }

    override fun fromTag(tag: CompoundTag?) {
        super.fromTag(tag)
        level = tag?.getInt("level") ?: 0
        crop = tag?.getString("crop") ?: ""
        using = tag?.getBoolean("using") ?: false
    }

    override fun get(): CropRacksEntity {
        return CropRacksEntity()
    }
}