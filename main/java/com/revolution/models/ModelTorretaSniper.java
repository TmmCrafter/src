package com.revolution.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTorretaSniper extends ModelBase
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
    ModelRenderer TorreAntena;
    ModelRenderer TorreCanon1;
    ModelRenderer TorreCanon2;
    ModelRenderer TorreCanon3;
    ModelRenderer TorreCanon4;
    ModelRenderer Soporte1;
    ModelRenderer Soporte2;
    ModelRenderer Soporte3;
    ModelRenderer Soporte4;
    ModelRenderer Soporte5;
  
  public ModelTorretaSniper()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      BaseSuelo1 = new ModelRenderer(this, 0, 51);
      BaseSuelo1.addBox(0F, 0F, 0F, 12, 1, 12);
      BaseSuelo1.setRotationPoint(-6F, 23F, -6F);
      BaseSuelo1.setTextureSize(64, 32);
      BaseSuelo1.mirror = true;
      setRotation(BaseSuelo1, 0F, 0F, 0F);
      BaseSuelo2 = new ModelRenderer(this, 0, 40);
      BaseSuelo2.addBox(0F, 0F, 0F, 10, 1, 10);
      BaseSuelo2.setRotationPoint(-5F, 22F, -5F);
      BaseSuelo2.setTextureSize(64, 32);
      BaseSuelo2.mirror = true;
      setRotation(BaseSuelo2, 0F, 0F, 0F);
      CuerpoTorre1 = new ModelRenderer(this, 106, 43);
      CuerpoTorre1.addBox(0F, 0F, 0F, 4, 17, 4);
      CuerpoTorre1.setRotationPoint(-2F, 0F, -2F);
      CuerpoTorre1.setTextureSize(64, 32);
      CuerpoTorre1.mirror = true;
      setRotation(CuerpoTorre1, 0F, 0F, 0F);
      BasePata1 = new ModelRenderer(this, 50, 108);
      BasePata1.addBox(0F, 0F, 0F, 4, 1, 19);
      BasePata1.setRotationPoint(-2F, 4F, 1F);
      BasePata1.setTextureSize(64, 32);
      BasePata1.mirror = true;
      setRotation(BasePata1, -1.308997F, 0F, 0F);
      BasePata2 = new ModelRenderer(this, 0, 123);
      BasePata2.addBox(0F, 0F, 0F, 20, 1, 4);
      BasePata2.setRotationPoint(1F, 4F, -2F);
      BasePata2.setTextureSize(64, 32);
      BasePata2.mirror = true;
      setRotation(BasePata2, 0F, 0F, 1.308997F);
      BasePata3 = new ModelRenderer(this, 0, 123);
      BasePata3.addBox(-20F, 0F, 0F, 20, 1, 4);
      BasePata3.setRotationPoint(-1F, 4F, -2F);
      BasePata3.setTextureSize(64, 32);
      BasePata3.mirror = true;
      setRotation(BasePata3, 0F, 0F, -1.308997F);
      BasePara4 = new ModelRenderer(this, 0, 100);
      BasePara4.addBox(0F, 0F, -20F, 4, 1, 20);
      BasePara4.setRotationPoint(-2F, 4F, -1F);
      BasePara4.setTextureSize(64, 32);
      BasePara4.mirror = true;
      setRotation(BasePara4, 1.308997F, 0F, 0F);
      TorreCabeza1 = new ModelRenderer(this, 80, 66);
      TorreCabeza1.addBox(0F, 0F, 0F, 8, 4, 16);
      TorreCabeza1.setRotationPoint(-4F, -5F, -6F);
      TorreCabeza1.setTextureSize(64, 32);
      TorreCabeza1.mirror = true;
      setRotation(TorreCabeza1, 0F, 0F, 0F);
      TorreCabeza2 = new ModelRenderer(this, 35, 23);
      TorreCabeza2.addBox(0F, 0F, 0F, 6, 1, 14);
      TorreCabeza2.setRotationPoint(-3F, -6F, -5F);
      TorreCabeza2.setTextureSize(64, 32);
      TorreCabeza2.mirror = true;
      setRotation(TorreCabeza2, 0F, 0F, 0F);
      TorreCabeza3 = new ModelRenderer(this, 35, 23);
      TorreCabeza3.addBox(0F, 0F, 0F, 6, 1, 14);
      TorreCabeza3.setRotationPoint(-3F, -1F, -5F);
      TorreCabeza3.setTextureSize(64, 32);
      TorreCabeza3.mirror = true;
      setRotation(TorreCabeza3, 0F, 0F, 0F);
      TorreAntena = new ModelRenderer(this, 76, 30);
      TorreAntena.addBox(0F, 0F, 0F, 1, 5, 1);
      TorreAntena.setRotationPoint(1F, -11F, 6F);
      TorreAntena.setTextureSize(64, 32);
      TorreAntena.mirror = true;
      setRotation(TorreAntena, 0F, 0F, 0F);
      TorreCanon1 = new ModelRenderer(this, 37, 65);
      TorreCanon1.addBox(0F, 0F, 0F, 1, 2, 20);
      TorreCanon1.setRotationPoint(-1.5F, -4F, -26F);
      TorreCanon1.setTextureSize(64, 32);
      TorreCanon1.mirror = true;
      setRotation(TorreCanon1, 0F, 0F, 0F);
      TorreCanon2 = new ModelRenderer(this, 0, 0);
      TorreCanon2.addBox(0F, 0F, 0F, 2, 1, 20);
      TorreCanon2.setRotationPoint(-1F, -4.5F, -26F);
      TorreCanon2.setTextureSize(64, 32);
      TorreCanon2.mirror = true;
      setRotation(TorreCanon2, 0F, 0F, 0F);
      TorreCanon3 = new ModelRenderer(this, 54, 42);
      TorreCanon3.addBox(0F, 0F, 0F, 1, 2, 20);
      TorreCanon3.setRotationPoint(0.5F, -4F, -26F);
      TorreCanon3.setTextureSize(64, 32);
      TorreCanon3.mirror = true;
      setRotation(TorreCanon3, 0F, 0F, 0F);
      TorreCanon4 = new ModelRenderer(this, 0, 0);
      TorreCanon4.addBox(0F, 0F, 0F, 2, 1, 20);
      TorreCanon4.setRotationPoint(-1F, -2.5F, -26F);
      TorreCanon4.setTextureSize(64, 32);
      TorreCanon4.mirror = true;
      setRotation(TorreCanon4, 0F, 0F, 0F);
      Soporte1 = new ModelRenderer(this, 70, 0);
      Soporte1.addBox(0F, 0F, 0F, 1, 10, 4);
      Soporte1.setRotationPoint(-4F, -1F, -2F);
      Soporte1.setTextureSize(64, 32);
      Soporte1.mirror = true;
      setRotation(Soporte1, 0F, 0F, -0.2617994F);
      Soporte2 = new ModelRenderer(this, 100, 15);
      Soporte2.addBox(0F, 0F, 0F, 4, 11, 1);
      Soporte2.setRotationPoint(-2F, -1F, 7F);
      Soporte2.setTextureSize(64, 32);
      Soporte2.mirror = true;
      setRotation(Soporte2, -0.6981317F, 0F, 0F);
      Soporte3 = new ModelRenderer(this, 82, 0);
      Soporte3.addBox(-1F, 0F, 0F, 1, 10, 4);
      Soporte3.setRotationPoint(4F, -1F, -2F);
      Soporte3.setTextureSize(64, 32);
      Soporte3.mirror = true;
      setRotation(Soporte3, 0F, 0F, 0.2617994F);
      Soporte4 = new ModelRenderer(this, 82, 15);
      Soporte4.addBox(0F, 0F, 0F, 4, 10, 1);
      Soporte4.setRotationPoint(-2F, -1F, -4F);
      Soporte4.setTextureSize(64, 32);
      Soporte4.mirror = true;
      setRotation(Soporte4, 0.2617994F, 0.0174533F, 0F);
      Soporte5 = new ModelRenderer(this, 0, 70);
      Soporte5.addBox(0F, 0F, 0F, 5, 2, 5);
      Soporte5.setRotationPoint(-2.5F, 6.5F, -2.5F);
      Soporte5.setTextureSize(64, 32);
      Soporte5.mirror = true;
      setRotation(Soporte5, 0F, 0F, 0F);
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
    TorreAntena.render(f5);
    TorreCanon1.render(f5);
    TorreCanon2.render(f5);
    TorreCanon3.render(f5);
    TorreCanon4.render(f5);
    Soporte1.render(f5);
    Soporte2.render(f5);
    Soporte3.render(f5);
    Soporte4.render(f5);
    Soporte5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
