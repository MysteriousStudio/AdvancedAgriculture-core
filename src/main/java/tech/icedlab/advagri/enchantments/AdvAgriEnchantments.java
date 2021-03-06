package tech.icedlab.advagri.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tech.icedlab.advagri.ModAta;

public class AdvAgriEnchantments {

    private static String modid = ModAta.ModID;

    public void InitAllEnchantment() {
        AddEnchantment("icespeed", new IceSpeedEnchantment());
    }

    private void AddEnchantment(String enchantmentName, Enchantment enchantment) {
        Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(modid, enchantmentName),
                enchantment
        );
    }

    public static AdvAgriEnchantments getINSTANCE() {
        return INSTANCE;
    }

    public static AdvAgriEnchantments INSTANCE = new AdvAgriEnchantments();

    private AdvAgriEnchantments() {
    }
}
