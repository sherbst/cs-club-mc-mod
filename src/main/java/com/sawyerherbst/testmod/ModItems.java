package com.sawyerherbst.testmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	public static final RegistryObject<Item> TUTORIAL_DUST = ITEMS.register("tutorial_dust", () -> new Item(new Item.Properties()));
}
