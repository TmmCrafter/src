package com.revolution.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.revolution.core.RevolutionMain;
import com.revolution.entity.projectiles.EntityFuego;
import com.revolution.models.ModelBala;
import com.revolution.models.ModelTestFuego;

@SideOnly(Side.CLIENT)
public class RenderBala extends Render
{
    private static final ResourceLocation texture = new ResourceLocation(RevolutionMain.MODID + ":" + "textures/models/entity/bala.png");
    private static final String __OBFID = "CL_00000978";

    private ModelBase model;

	public RenderBala() {
	model = new ModelBala();
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