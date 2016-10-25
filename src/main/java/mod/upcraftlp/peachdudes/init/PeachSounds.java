package mod.upcraftlp.peachdudes.init;

import core.upcraftlp.craftdev.API.common.ModRegistry;
import mod.upcraftlp.peachdudes.Reference;
import net.minecraft.util.SoundEvent;

public class PeachSounds {

	public static SoundEvent PEACHDUDE_HURT;
	public static SoundEvent PEACHDUDE_DEATH;
	public static SoundEvent PEACHDUDE_SCREAM;
	public static SoundEvent PEACHDUDE_BOING;
	
	public static void init() {
		PEACHDUDE_HURT = ModRegistry.registerSound("peachdude.hurt", Reference.MODID);
		PEACHDUDE_DEATH = ModRegistry.registerSound("peachdude.death", Reference.MODID);
		PEACHDUDE_SCREAM = ModRegistry.registerSound("peachdude.scream", Reference.MODID);
		PEACHDUDE_BOING = ModRegistry.registerSound("peachdude.boing", Reference.MODID);
	}
}
