package net.mmj.Test.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mmj.Test.ForgeTest1;
import net.mmj.Test.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,  ForgeTest1.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Modded_TAB = CREATIVE_MODE_TAB.register("modded_tab", () -> CreativeModeTab.builder().icon(() ->
                    new ItemStack(moditems.RAW_TITANIUM.get()))
            .title(Component.translatable("creativetab.modded_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(moditems.TITANIUM_INGOT.get());
                output.accept(moditems.RAW_TITANIUM.get());
                output.accept(ModBlocks.TITANIUM_BLOCK.get());
                output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                output.accept(ModBlocks.TITANIUM_ORE.get());
                output.accept(ModBlocks.NETHERRACK_TITANIUM_ORE.get());
                output.accept(ModBlocks.END_STONE_TITANIUM_ORE.get());
                output.accept(ModBlocks.DENSE_TITANIUM.get());
                output.accept(moditems.HARDENED_TITANIUM_INGOT.get());
            })
            .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
