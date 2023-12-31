package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ItemGroupRegistry {
    public static final RegistryKey<ItemGroup> BAM_BLOCK = RegistryKey.of(RegistryKeys.ITEM_GROUP, BetterAdventureModeContent.identifier("bam_block"));
    public static final RegistryKey<ItemGroup> BAM_EQUIPMENT = RegistryKey.of(RegistryKeys.ITEM_GROUP, BetterAdventureModeContent.identifier("bam_equipment"));
    public static final RegistryKey<ItemGroup> BAM_FOOD = RegistryKey.of(RegistryKeys.ITEM_GROUP, BetterAdventureModeContent.identifier("bam_food"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, BAM_BLOCK, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ItemRegistry.ZWEIHANDER))
                .displayName(Text.translatable("itemGroup.bamcontent.bam_block"))
                .build());
        Registry.register(Registries.ITEM_GROUP, BAM_EQUIPMENT, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ItemRegistry.ZWEIHANDER))
                .displayName(Text.translatable("itemGroup.bamcontent.bam_equipment"))
                .build());
        Registry.register(Registries.ITEM_GROUP, BAM_FOOD, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ItemRegistry.ZWEIHANDER))
                .displayName(Text.translatable("itemGroup.bamcontent.bam_food"))
                .build());
    }
}
