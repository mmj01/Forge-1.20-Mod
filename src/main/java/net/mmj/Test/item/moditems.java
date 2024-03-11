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

    public static final RegistryObject<Item> titanium = ITEMS.register("titanium",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_titanium = ITEMS.register("raw_titanium",() -> new Item(new Item.Properties()));



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
