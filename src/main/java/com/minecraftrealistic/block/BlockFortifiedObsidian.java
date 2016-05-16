package com.minecraftrealistic.block;

import net.minecraft.block.BlockObsidian;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

final public class BlockFortifiedObsidian extends BlockObsidian
{
    public BlockFortifiedObsidian()
    {
        setUnlocalizedName( "Fortified Obsidian" );
        setCreativeTab( CreativeTabs.tabBlock );
        setHardness( 10.0F );
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ )
    {
        System.out.println( "onBlockActivated" );
        return super.onBlockActivated( worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ );
    }
}