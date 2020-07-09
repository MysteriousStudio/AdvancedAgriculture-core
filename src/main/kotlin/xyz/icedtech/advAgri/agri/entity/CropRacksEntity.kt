package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.nbt.CompoundTag
import java.util.function.Supplier

class CropRacksEntity : BlockEntity(CROP_RACKS_ENTITY), Supplier<CropRacksEntity> {

    private var age = 0
    private var crop = ""
    private var using = false

    override fun toTag(tag: CompoundTag?): CompoundTag {
        tag?.putInt("age", age)
        tag?.putString("crop", crop)
        tag?.putBoolean("using", false)
        return super.toTag(tag)
    }

    override fun fromTag(state: BlockState?, tag: CompoundTag?) {
        super.fromTag(state, tag)
        age = tag?.getInt("age") ?: 0
        crop = tag?.getString("crop") ?: ""
        using = tag?.getBoolean("using") ?: false
    }

    override fun get(): CropRacksEntity {
        return CropRacksEntity()
    }
}