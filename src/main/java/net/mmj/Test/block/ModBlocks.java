package net.mmj.Test.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
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

    public static final RegistryObject<Block> DENSE_TITANIUM = registerBlock("dense_titanium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> END_STONE_TITANIUM_ORE = registerBlock("end_stone_titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(5, 7)));

    public static final RegistryObject<Block> NETHERRACK_TITANIUM_ORE = registerBlock("netherrack_titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(4, 7)));

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));






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
