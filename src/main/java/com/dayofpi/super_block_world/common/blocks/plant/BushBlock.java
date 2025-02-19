package com.dayofpi.super_block_world.common.blocks.plant;

import com.dayofpi.super_block_world.registry.main.ItemInit;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

@SuppressWarnings("deprecation")
public class BushBlock extends PlantBlock implements Fertilizable {
    public static final IntProperty FRUITS;
    protected static final VoxelShape SHAPE;

    static {
        FRUITS = IntProperty.of("fruits", 0, 2);
        SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FRUITS);
    }

    public BushBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FRUITS, 0));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (player.getStackInHand(Hand.MAIN_HAND).isOf(Items.SHEARS) || player.getStackInHand(Hand.OFF_HAND).isOf(Items.SHEARS)) {
            Block.dropStack(world, pos, new ItemStack(ItemInit.YOSHI_FRUIT, state.get(FRUITS)));
        }
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.DIRT) || floor.isIn(BlockTags.SAND) || floor.isOf(Blocks.FARMLAND);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(FRUITS) > 0 && !player.getStackInHand(Hand.MAIN_HAND).isOf(Items.BONE_MEAL) || state.get(FRUITS) == 2) {
            world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 0.6F, 1.1F);
            world.setBlockState(pos, state.with(FRUITS, state.get(FRUITS) - 1), 2);
            Block.dropStack(world, pos, new ItemStack(ItemInit.YOSHI_FRUIT, 1));
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(FRUITS) < 2;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBlockState(pos).get(FRUITS) < 2 && world.getLightLevel(pos.up()) >= 9 && random.nextInt(3) == 0) {
            this.grow(world, random, pos, state);
        }
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, state.with(FRUITS, state.get(FRUITS) + 1));
    }
}
