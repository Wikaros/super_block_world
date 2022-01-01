package com.dayofpi.super_block_world.main.registry.world.feature.utility;

import com.dayofpi.super_block_world.main.common.block.plant.BushBlock;
import com.dayofpi.super_block_world.main.common.block.plant.PiranhaLilyBlock;
import com.dayofpi.super_block_world.main.common.block.item_block.CoinBlock;
import com.dayofpi.super_block_world.main.registry.block.BlockRegistry;
import com.dayofpi.super_block_world.main.registry.block.MushroomBlocks;
import com.dayofpi.super_block_world.main.registry.block.PlantBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.collection.DataPool;

public class DataPools {
    static final DataPool.Builder<BlockState> BRICK_PILE = DataPool.<BlockState>builder().add(BlockRegistry.TOADSTONE_BRICKS.getDefaultState(), 5).add(BlockRegistry.QUESTION_BLOCK.getDefaultState(), 1).add(BlockRegistry.COIN_BLOCK.getDefaultState().with(CoinBlock.TYPE, 1), 2).add(BlockRegistry.FAKE_BLOCK.getDefaultState(), 1);

    public static final DataPool.Builder<BlockState> PLANT_GRASSLAND = DataPool.<BlockState>builder().add(Blocks.GRASS.getDefaultState(), 90).add(Blocks.TALL_GRASS.getDefaultState(), 30).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 0), 30).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 1), 15).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 2), 5).add(PlantBlocks.VEGETABLE.getDefaultState(), 3);
    public static final DataPool.Builder<BlockState> PLANT_FOSSIL_FALLS = DataPool.<BlockState>builder().add(Blocks.GRASS.getDefaultState(), 90).add(Blocks.TALL_GRASS.getDefaultState(), 30).add(Blocks.FERN.getDefaultState(), 50).add(Blocks.LARGE_FERN.getDefaultState(), 5);
    public static final DataPool.Builder<BlockState> PLANT_MUSHROOM_GORGE = DataPool.<BlockState>builder().add(Blocks.GRASS.getDefaultState(), 90).add(Blocks.TALL_GRASS.getDefaultState(), 30).add(Blocks.FERN.getDefaultState(), 30).add(Blocks.LARGE_FERN.getDefaultState(), 30).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 0), 30);
    public static final DataPool.Builder<BlockState> PLANT_DRY_DRY_DESERT = DataPool.<BlockState>builder().add(Blocks.DEAD_BUSH.getDefaultState(), 90).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 0), 60).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 1), 15).add(PlantBlocks.BUSH.getDefaultState().with(BushBlock.FRUITS, 2), 5);

    public static final DataPool.Builder<BlockState> FLOWER_GRASSLAND = DataPool.<BlockState>builder().add(PlantBlocks.BLUE_SONGFLOWER.getDefaultState(), 5).add(PlantBlocks.YELLOW_SONGFLOWER.getDefaultState(), 2).add(PlantBlocks.PINK_SONGFLOWER.getDefaultState(), 2).add(PlantBlocks.PURPLE_SONGFLOWER.getDefaultState(), 2);
    public static final DataPool.Builder<BlockState> FLOWER_CHEEP_CHEEP_REEF = DataPool.<BlockState>builder().add(PlantBlocks.BLUE_SONGFLOWER.getDefaultState(), 1).add(PlantBlocks.YELLOW_SONGFLOWER.getDefaultState(), 1).add(PlantBlocks.PINK_SONGFLOWER.getDefaultState(), 1).add(PlantBlocks.PAWFLOWER.getDefaultState(), 3);
    public static final DataPool.Builder<BlockState> FLOWER_FOREST_OF_ILLUSION = DataPool.<BlockState>builder().add(PlantBlocks.PURPLE_SONGFLOWER.getDefaultState(), 10).add(PlantBlocks.YELLOW_SONGFLOWER.getDefaultState(), 10).add(PlantBlocks.PINK_SONGFLOWER.getDefaultState(), 10).add(PlantBlocks.FIRE_TULIP.getDefaultState(), 5);
    public static final DataPool.Builder<BlockState> FLOWER_WATER = DataPool.<BlockState>builder().add(Blocks.LILY_PAD.getDefaultState(), 2).add(PlantBlocks.PIRANHA_LILY.getDefaultState().with(PiranhaLilyBlock.FLOATING, true), 2);
    public static final DataPool.Builder<BlockState> FLOWERBED = DataPool.<BlockState>builder().add(Blocks.DANDELION.getDefaultState(), 1).add(PlantBlocks.YELLOW_FLOWERBED.getDefaultState(), 10).add(PlantBlocks.WHITE_FLOWERBED.getDefaultState(), 4).add(PlantBlocks.HYBRID_FLOWERBED.getDefaultState(), 2).add(PlantBlocks.PURPLE_SONGFLOWER.getDefaultState(), 1);

    public static final DataPool.Builder<BlockState> MUSHROOM_GRASSLAND = DataPool.<BlockState>builder().add(MushroomBlocks.YELLOW_MUSHROOM.getDefaultState(), 2).add(Blocks.BROWN_MUSHROOM.getDefaultState(), 2).add(Blocks.RED_MUSHROOM.getDefaultState(), 1);
    public static final DataPool.Builder<BlockState> MUSHROOM_AMANITA_FOREST = DataPool.<BlockState>builder().add(Blocks.RED_MUSHROOM.getDefaultState(), 4).add(MushroomBlocks.PURPLE_MUSHROOM.getDefaultState(), 2).add(Blocks.BROWN_MUSHROOM.getDefaultState(), 2);
    public static final DataPool.Builder<BlockState> MUSHROOM_AUTUMN_FOREST = DataPool.<BlockState>builder().add(MushroomBlocks.ORANGE_MUSHROOM.getDefaultState(), 2).add(Blocks.RED_MUSHROOM.getDefaultState(), 1);
    public static final DataPool.Builder<BlockState> CAVE_DECORATION_COMMON_POOL = DataPool.<BlockState>builder().add(Blocks.BROWN_MUSHROOM.getDefaultState(), 30).add(Blocks.RED_MUSHROOM.getDefaultState(), 30).add(PlantBlocks.CAVE_MUSHROOMS.getDefaultState(), 50).add(MushroomBlocks.GREEN_MUSHROOM.getDefaultState(), 45).add(MushroomBlocks.YELLOW_MUSHROOM.getDefaultState(), 30).add(PlantBlocks.VEGETABLE.getDefaultState(), 10);
    public static final DataPool.Builder<BlockState> CAVE_DECORATION_RARE_POOL = DataPool.<BlockState>builder().add(BlockRegistry.STONE_TORCH.getDefaultState(), 1).add(BlockRegistry.STONE_TORCH.getDefaultState().with(Properties.LIT, false), 1);
}
