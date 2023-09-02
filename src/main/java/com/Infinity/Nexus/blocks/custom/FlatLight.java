package com.Infinity.Nexus.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FlatLight extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public FlatLight(Properties properties) {
        super(properties);
    }

    //Replace final .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_N = Block.box(0, 0, 15.75, 16, 16, 16);
    private static final VoxelShape SHAPE_W = Block.box(15.75, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_S = Block.box(0, 0, 0, 16, 16, 0.25);
    private static final VoxelShape SHAPE_E = Block.box(0, 0, 0, 0.25, 16, 16);
    private static final VoxelShape SHAPE_U = Block.box(0, 15.75, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_D = Block.box(0, 0, 0, 16, 0.25, 16);


    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING)) {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case UP:
                return SHAPE_U;
            case DOWN:
                return SHAPE_D;
            default:
                return SHAPE_N;
        }
    }

    //Facing//
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }
    //Replace

    public @NotNull BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

}