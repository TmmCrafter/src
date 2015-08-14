package com.revolution.render;

import com.revolution.core.RevolutionMain;
import com.revolution.models.ModelTorretaBasica;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTorretaBasica extends RenderLiving {
	private ResourceLocation textura = new ResourceLocation(RevolutionMain.MODID + ":" + "textures/models/entity/TorretaBasica.png");

	public RenderTorretaBasica(ModelTorretaBasica p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textura;
	}

}
