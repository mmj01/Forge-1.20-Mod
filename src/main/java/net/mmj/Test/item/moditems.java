package net.mmj.Test.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mmj.Test.ForgeTest1;

public class moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeTest1.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_TITANIUM_INGOT = ITEMS.register("hardened_titanium_ingot",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BINDED_TITANIUM_INGOT = ITEMS.register("binded_titanium_ingot",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_BINDED_TITANIUM = ITEMS.register("iron_binded_titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BINDED_TITANIUM = ITEMS.register("copper_binded_titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BINDED_TITANIUM = ITEMS.register("gold_binded_titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BINDED_TITANIUM = ITEMS.register("diamond_binded_titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BINDED_TITANIUM = ITEMS.register("netherite_binded_titanium",() -> new Item(new Item.Properties()));







    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
