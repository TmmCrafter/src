package com.revolution.entity;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.revolution.entity.projectiles.EntityBalaSniper;

public class EntityTorretaSniper extends EntityCreature implements IRangedAttackMob{

	public EntityTorretaSniper(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIArrowAttack(this, 0.0D, 30, 2, 100.0F));
		this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityMob.class, 100.0F));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, IMob.mobSelector));
	}
	@Override
	protected void applyEntityAttributes()
	{
		 super.applyEntityAttributes();
		 getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0F);
	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.00000001D);
	this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10.0D);
	}	
	protected Item getDropItem(){
		return Items.iron_ingot;
	}
	protected void dropFewItems(boolean par3, int par2){
		int random = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);
		for(int k = 0; k < random; ++k){
			if(k == 2){
				this.dropItem(Items.iron_ingot, 10);
			}else if(k == 1){
				this.dropItem(Items.iron_ingot, 7);
			}
		}
	}
	public boolean isAIEnabled()
	{
		 return true;
	}{
	}
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_,
			float p_82196_2_) {
		EntityBalaSniper entityarrow = new EntityBalaSniper(this.worldObj, this, p_82196_1_, 1.6F, (float)(10 - this.worldObj.difficultySetting.getDifficultyId() * 4));
        int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
        int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
        entityarrow.setDamage((double)(p_82196_2_ * 40.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.difficultySetting.getDifficultyId() * 0.11F));
        entityarrow.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)0.35, this.posY - this.motionY * (double)0.25, this.posZ - this.motionZ * (double)0.25, this.motionX, this.motionY, this.motionZ);

        if (i > 0)
        {
            entityarrow.setDamage(entityarrow.getDamage() + (double)i * 0.5D + 0.5D);
        }

        if (j > 0)
        {
            entityarrow.setKnockbackStrength(j);
        
            
        }

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityarrow);		
	}
	protected boolean canDespawn()
    {
        return false;
    }

}
