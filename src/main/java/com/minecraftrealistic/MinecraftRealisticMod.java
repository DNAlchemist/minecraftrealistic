package com.minecraftrealistic;

import com.minecraftrealistic.block.BlockFortifiedObsidian;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod( modid = MinecraftRealisticMod.MODID, version = MinecraftRealisticMod.VERSION )
public class MinecraftRealisticMod
{
    public static final String MODID = "minecraftrealistic";
    public static final String VERSION = "0.01";
    
    @EventHandler
    public void init( FMLInitializationEvent event )
    {
        GameRegistry.register( new BlockFortifiedObsidian(), new ResourceLocation( "Fortified Obsidian" ) );
    }

}
