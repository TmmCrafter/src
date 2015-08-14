package com.revolution.referencias;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.revolution.core.RevolutionMain;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClaseVoids {
	public static CreativeTabs tabMilitar,tabMago,tabNinja,tabDesconocida;
	public static void RegistrarTabs(){
		tabMilitar = new CreativeTabs("tabMilitar"){

			@Override
			public Item getTabIconItem() {
				return Items.blaze_rod;
			}
		};
		tabMago = new CreativeTabs("tabMago"){

			@Override
			public Item getTabIconItem() {
				return Items.blaze_rod;
			}
		};
		tabNinja = new CreativeTabs("tabNinja"){

			@Override
			public Item getTabIconItem() {
				return Items.blaze_rod;
			}
		};
		tabDesconocida = new CreativeTabs("tabDesconocida"){

			@Override
			public Item getTabIconItem() {
				return Items.blaze_rod;
			}
		};
	}
	 public static void RegistrarEntityALoRandom(Class entityClass, String nombre){
	        int entityID = EntityRegistry.findGlobalUniqueEntityId();
	        long seed = nombre.hashCode();
	        Random rand = new Random(seed);
	        int primaryColor = rand.nextInt() * 16777215;
	        int secondaryColor = rand.nextInt() * 16777215;

	        EntityRegistry.registerGlobalEntityID(entityClass, nombre, entityID);
	        EntityRegistry.registerModEntity(entityClass, nombre, entityID, RevolutionMain.instance, 64, 1, true);
	        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	        }
	    
	    public static void RegistrarEntityALoRandomSinSpawn(Class entityClass, String nombre){
	        int entityID = EntityRegistry.findGlobalUniqueEntityId();
	        long seed = nombre.hashCode();
	        Random rand = new Random(seed);

	        EntityRegistry.registerGlobalEntityID(entityClass, nombre, entityID);
	        EntityRegistry.registerModEntity(entityClass, nombre, entityID, RevolutionMain.instance, 64, 1, true);
	        }
	    public static void RegistrarItemMilitar(Item nombreClaseItem, String nombreItem){
	    	nombreClaseItem.setUnlocalizedName(nombreItem).setCreativeTab(tabMilitar).setTextureName(RevolutionMain.MODID + ":" + nombreItem).setFull3D();
	    	GameRegistry.registerItem(nombreClaseItem, nombreItem);
	    };

}
