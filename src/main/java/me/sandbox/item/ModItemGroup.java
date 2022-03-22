package me.sandbox.item;

import me.sandbox.Sandbox;
import me.sandbox.block.BlockRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SandBoxMisc = FabricItemGroupBuilder.build(new Identifier(Sandbox.MOD_ID, "sandboxmisc"),
            () -> new ItemStack(ItemRegistry.RAVAGER_HORN));

    public static final ItemGroup SandBoxMobs = FabricItemGroupBuilder.build(new Identifier(Sandbox.MOD_ID, "sandboxmobs"),
            () -> new ItemStack(ItemRegistry.PROVOKER_SPAWN_EGG));
}
