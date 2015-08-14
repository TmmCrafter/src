package com.revolution.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.revolution.entity.projectiles.EntityFuego;
import com.revolution.models.ModelTestFuego;

public class RenderTestFuego extends Render{
	private static final ResourceLocation texture = new ResourceLocation("megamod" + ":" + "textures/entity/Minibombmodel.png");
	private ModelBase model;

	public RenderTestFuego() {
	model = new ModelTestFuego();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
	return getCustomTexture((EntityFuego) entity);
	}

	private ResourceLocation getCustomTexture(EntityFuego entity) {
	return texture;
	}
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick) {
	bindTexture(texture);
	GL11.glPushMatrix();
	GL11.glTranslated(x, y, z);
	model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
	GL11.glPopMatrix();
	}

}
