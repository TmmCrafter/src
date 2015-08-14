package com.revolution.core;

import net.minecraftforge.client.MinecraftForgeClient;

import com.revolution.entity.EntityTorretaBasica;
import com.revolution.entity.EntityTorretaLanzallamas;
import com.revolution.entity.EntityTorretaSniper;
import com.revolution.entity.projectiles.EntityBala;
import com.revolution.entity.projectiles.EntityFuego;
import com.revolution.models.ModelTorretaBasica;
import com.revolution.models.ModelTorretaLanzallamas;
import com.revolution.models.ModelTorretaSniper;
import com.revolution.render.RenderBala;
import com.revolution.render.RenderTestFuego;
import com.revolution.render.RenderTorretaBasica;
import com.revolution.render.RenderTorretaLanzallamas;
import com.revolution.render.RenderTorretaSniper;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void RegistrarRenders(){
		RenderingRegistry.registerEntityRenderingHandler(EntityTorretaBasica.class, new RenderTorretaBasica(new ModelTorretaBasica(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTorretaLanzallamas.class, new RenderTorretaLanzallamas(new ModelTorretaLanzallamas(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTorretaSniper.class, new RenderTorretaSniper(new ModelTorretaSniper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFuego.class, new RenderTestFuego());
		RenderingRegistry.registerEntityRenderingHandler(EntityBala.class, new RenderBala());
	}

}
