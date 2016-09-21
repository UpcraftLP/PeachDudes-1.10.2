package mod.upcraftlp.peachdudes.entity;

import mod.upcraftlp.peachdudes.init.PeachSounds;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityPeachdude extends EntityCreature {

	private EntityAIAvoidEntity<EntityPlayer> avoidEntity;
	
	public EntityPeachdude(World world, BlockPos pos) {
		this(world, pos.getX(), pos.getY(), pos.getZ());
	}
	
	public EntityPeachdude(World world, double x, double y, double z) {
		super(world);
		this.setPositionAndUpdate(x, y, z);
		this.height = 0.3f;
	}
	
	@Override
	protected void applyEntityAttributes() {
		 super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D * 1.3D);
	}
	
	private long lastScream = 0;
	
	@Override
	protected void updateAITasks() {
		if(this.avoidEntity == null) {
			EntityAIAvoidEntity<EntityPlayer> entityToAvoid = new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 16.0F, 0.8D, 1.33D);
			if(entityToAvoid != null) {
				this.avoidEntity = entityToAvoid;
			}
		}
		if(this.avoidEntity != null) {
			if(this.worldObj.getTotalWorldTime() > this.lastScream + 30) {
				this.playScreamSound();
				this.lastScream = this.worldObj.getTotalWorldTime();
			}
		}
		
		this.tasks.removeTask(this.avoidEntity);
		this.tasks.addTask(4, this.avoidEntity);
		
		super.updateAITasks();
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(10, new EntityAIWander(this, 0.8D));
	    this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
	}
	
	public void spawn() {
		this.worldObj.spawnEntityInWorld(this);
		this.setPositionAndUpdate(this.posX, this.posY, this.posZ);
		this.playScreamSound();
	}
	
	public EntityPeachdude(World worldIn) {
		super(worldIn);
	}
	
	@Override
	protected SoundEvent getHurtSound() {
		return PeachSounds.PEACHDUDE_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return PeachSounds.PEACHDUDE_DEATH;
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		if(!this.isJumping) this.jump();
		return PeachSounds.PEACHDUDE_BOING;
	}
	
	public void playScreamSound() {
		this.playSound(PeachSounds.PEACHDUDE_SCREAM, this.getSoundVolume(), this.getSoundPitch());
	}
	
	private long lastJump = 0;
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if(this.worldObj.getTotalWorldTime() > lastJump + 30) {
			lastJump = this.worldObj.getTotalWorldTime();
			this.playSound(this.getAmbientSound(), this.getSoundVolume(), this.getSoundPitch());
		}
	}

}
