package net.mmj.Test.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mmj.Test.ForgeTest1;
import net.mmj.Test.item.moditems;

import java.util.function.Supplier;

import static net.minecraftforge.registries.ForgeRegistries.BLOCKS;

public class ModBlocks {
    public static final DeferredRegister<Block> BlOCKS =
            DeferredRegister.create(BLOCKS, ForgeTest1.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
    () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.ANVIL)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> Block){
        RegistryObject<T> toReturn = BlOCKS.register(name, Block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block > RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }




    public  static  void register(IEventBus eventbus) {
        BlOCKS.register(eventbus);


    }

}
