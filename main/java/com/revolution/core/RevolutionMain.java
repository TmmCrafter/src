package com.revolution.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import com.revolution.entity.EntityTorretaBasica;
import com.revolution.entity.EntityTorretaLanzallamas;
import com.revolution.entity.EntityTorretaSniper;
import com.revolution.entity.projectiles.EntityBala;
import com.revolution.entity.projectiles.EntityBalaSniper;
import com.revolution.entity.projectiles.EntityFuego;
import com.revolution.referencias.ClaseVoids;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RevolutionMain.MODID, version = RevolutionMain.VERSION, name = RevolutionMain.NAME)
public class RevolutionMain
{
	@SidedProxy(clientSide = "com.revolution.core.ClientProxy", serverSide = "com.revolution.core.CommonProxy")
	public static CommonProxy proxy;
	public static final String NAME = "Revolution Mod";
    public static final String VERSION = "0.0.1";
    public static final String MODID = "revolution_mod";
    public static ToolMaterial EnumToolMaterialLoQueSea;
    @Instance(RevolutionMain.MODID)
	public static RevolutionMain instance;

    @EventHandler 
    
    public void init(FMLInitializationEvent event)
    {
    	proxy.RegistrarRenders();
    	
    	//Tabs
    	ClaseVoids.RegistrarTabs();    	
    	//Craft
    	//Items
    	//Craft
    	//Armor
    	//Event
    	//Block
    	//Entity
    	ClaseVoids.RegistrarEntityALoRandom(EntityTorretaBasica.class, "TorretaBasica");
    	ClaseVoids.RegistrarEntityALoRandom(EntityTorretaLanzallamas.class, "TorretaLanzallamas");
    	ClaseVoids.RegistrarEntityALoRandom(EntityTorretaSniper.class, "TorretaSniper");
    	
    	ClaseVoids.RegistrarEntityALoRandomSinSpawn(EntityBala.class, "Bala");
    	ClaseVoids.RegistrarEntityALoRandomSinSpawn(EntityFuego.class, "Fuego");
    	ClaseVoids.RegistrarEntityALoRandomSinSpawn(EntityBalaSniper.class, "BalaSniper");
		
		
    }
}
