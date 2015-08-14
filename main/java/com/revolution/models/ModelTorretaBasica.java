package com.revolution.models;

import com.revolution.entity.EntityTorretaBasica;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTorretaBasica extends ModelBase
{
  //fields
    ModelRenderer BaseSuelo1;
    ModelRenderer BaseSuelo2;
    ModelRenderer CuerpoTorre1;
    ModelRenderer BasePata1;
    ModelRenderer BasePata2;
    ModelRenderer BasePata3;
    ModelRenderer BasePara4;
    ModelRenderer TorreCabeza1;
    ModelRenderer TorreCabeza2;
    ModelRenderer TorreCabeza3;
    ModelRenderer TorreCanon1;
    ModelRenderer TorreAntena;
    ModelRenderer TorreCanon2;
    ModelRenderer TorreCanon3;
    ModelRenderer TorreCanon4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
  public ModelTorretaBasica()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      BaseSuelo1 = new ModelRenderer(this, 0, 51);
      BaseSuelo1.addBox(0F, 0F, 0F, 12, 1, 12);
      BaseSuelo1.setRotationPoint(-6F, 23F, -6F);
      BaseSuelo1.setTextureSize(128, 128);
      BaseSuelo1.mirror = true;
      setRotation(BaseSuelo1, 0F, 0F, 0F);
      BaseSuelo2 = new ModelRenderer(this, 0, 40);
      BaseSuelo2.addBox(0F, 0F, 0F, 10, 1, 10);
      BaseSuelo2.setRotationPoint(-5F, 22F, -5F);
      BaseSuelo2.setTextureSize(128, 128);
      BaseSuelo2.mirror = true;
      setRotation(BaseSuelo2, 0F, 0F, 0F);
      CuerpoTorre1 = new ModelRenderer(this, 0, 16);
      CuerpoTorre1.addBox(0F, 0F, 0F, 4, 17, 4);
      CuerpoTorre1.setRotationPoint(-2F, 0F, -2F);
      CuerpoTorre1.setTextureSize(128, 128);
      CuerpoTorre1.mirror = true;
      setRotation(CuerpoTorre1, 0F, 0F, 0F);
      BasePata1 = new ModelRenderer(this, 50, 100);
      BasePata1.addBox(0F, 0F, 0F, 4, 1, 19);
      BasePata1.setRotationPoint(-2F, 4F, 1F);
      BasePata1.setTextureSize(128, 128);
      BasePata1.mirror = true;
      setRotation(BasePata1, -1.308997F, 0F, 0F);
      BasePata2 = new ModelRenderer(this, 0, 101);
      BasePata2.addBox(0F, 0F, 0F, 20, 1, 4);
      BasePata2.setRotationPoint(1F, 4F, -2F);
      BasePata2.setTextureSize(128, 128);
      BasePata2.mirror = true;
      setRotation(BasePata2, 0F, 0F, 1.308997F);
      BasePata3 = new ModelRenderer(this, 0, 101);
      BasePata3.addBox(-20F, 0F, 0F, 20, 1, 4);
      BasePata3.setRotationPoint(-1F, 4F, -2F);
      BasePata3.setTextureSize(128, 128);
      BasePata3.mirror = true;
      setRotation(BasePata3, 0F, 0F, -1.308997F);
      BasePara4 = new ModelRenderer(this, 0, 79);
      BasePara4.addBox(0F, 0F, -20F, 4, 1, 20);
      BasePara4.setRotationPoint(-2F, 4F, -1F);
      BasePara4.setTextureSize(128, 128);
      BasePara4.mirror = true;
      setRotation(BasePara4, 1.308997F, 0F, 0F);
      TorreCabeza1 = new ModelRenderer(this, 27, 0);
      TorreCabeza1.addBox(0F, 0F, 0F, 8, 4, 13);
      TorreCabeza1.setRotationPoint(-4F, -5F, -6F);
      TorreCabeza1.setTextureSize(128, 128);
      TorreCabeza1.mirror = true;
      setRotation(TorreCabeza1, 0F, 0F, 0F);
      TorreCabeza2 = new ModelRenderer(this, 35, 17);
      TorreCabeza2.addBox(0F, 0F, 0F, 6, 1, 11);
      TorreCabeza2.setRotationPoint(-3F, -6F, -5F);
      TorreCabeza2.setTextureSize(128, 128);
      TorreCabeza2.mirror = true;
      setRotation(TorreCabeza2, 0F, 0F, 0F);
      TorreCabeza3 = new ModelRenderer(this, 35, 17);
      TorreCabeza3.addBox(0F, 0F, 0F, 6, 1, 11);
      TorreCabeza3.setRotationPoint(-3F, -1F, -5F);
      TorreCabeza3.setTextureSize(128, 128);
      TorreCabeza3.mirror = true;
      setRotation(TorreCabeza3, 0F, 0F, 0F);
      TorreCanon1 = new ModelRenderer(this, 37, 65);
      TorreCanon1.addBox(0F, 0F, 0F, 1, 2, 10);
      TorreCanon1.setRotationPoint(-1.5F, -4F, -14F);
      TorreCanon1.setTextureSize(128, 128);
      TorreCanon1.mirror = true;
      setRotation(TorreCanon1, 0F, 0F, 0F);
      TorreAntena = new ModelRenderer(this, 70, 30);
      TorreAntena.addBox(0F, 0F, 0F, 1, 5, 1);
      TorreAntena.setRotationPoint(1F, -11F, 4F);
      TorreAntena.setTextureSize(128, 128);
      TorreAntena.mirror = true;
      setRotation(TorreAntena, 0F, 0F, 0F);
      TorreCanon2 = new ModelRenderer(this, 0, 0);
      TorreCanon2.addBox(0F, 0F, 0F, 2, 1, 10);
      TorreCanon2.setRotationPoint(-1F, -4.5F, -14F);
      TorreCanon2.setTextureSize(128, 128);
      TorreCanon2.mirror = true;
      setRotation(TorreCanon2, 0F, 0F, 0F);
      TorreCanon3 = new ModelRenderer(this, 54, 42);
      TorreCanon3.addBox(0F, 0F, 0F, 1, 2, 10);
      TorreCanon3.setRotationPoint(0.5F, -4F, -14F);
      TorreCanon3.setTextureSize(128, 128);
      TorreCanon3.mirror = true;
      setRotation(TorreCanon3, 0F, 0F, 0F);
      TorreCanon4 = new ModelRenderer(this, 0, 0);
      TorreCanon4.addBox(0F, 0F, 0F, 2, 1, 10);
      TorreCanon4.setRotationPoint(-1F, -2.5F, -14F);
      TorreCanon4.setTextureSize(128, 128);
      TorreCanon4.mirror = true;
      setRotation(TorreCanon4, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 70, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 10, 4);
      Shape1.setRotationPoint(-4F, -1F, -2F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, -0.2617994F);
      Shape2 = new ModelRenderer(this, 70, 15);
      Shape2.addBox(0F, 0F, 0F, 4, 10, 1);
      Shape2.setRotationPoint(-2F, -1F, 3F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, -0.2617994F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 82, 0);
      Shape3.addBox(-1F, 0F, 0F, 1, 10, 4);
      Shape3.setRotationPoint(4F, -1F, -2F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0.2617994F);
      Shape4 = new ModelRenderer(this, 82, 15);
      Shape4.addBox(0F, 0F, 0F, 4, 10, 1);
      Shape4.setRotationPoint(-2F, -1F, -4F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0.2617994F, 0.0174533F, 0F);
      Shape5 = new ModelRenderer(this, 0, 70);
      Shape5.addBox(0F, 0F, 0F, 5, 2, 5);
      Shape5.setRotationPoint(-2.5F, 6.5F, -2.5F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BaseSuelo1.render(f5);
    BaseSuelo2.render(f5);
    CuerpoTorre1.render(f5);
    BasePata1.render(f5);
    BasePata2.render(f5);
    BasePata3.render(f5);
    BasePara4.render(f5);
    TorreCabeza1.render(f5);
    TorreCabeza2.render(f5);
    TorreCabeza3.render(f5);
    TorreCanon1.render(f5);
    TorreAntena.render(f5);
    TorreCanon2.render(f5);
    TorreCanon3.render(f5);
    TorreCanon4.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
