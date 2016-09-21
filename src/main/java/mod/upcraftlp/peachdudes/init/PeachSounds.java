package mod.upcraftlp.peachdudes.init;

import github.tca.core.API.ModRegistry;
import mod.upcraftlp.peachdudes.Reference;
import net.minecraft.util.SoundEvent;

public class PeachSounds {

	public static SoundEvent PEACHDUDE_HURT;
	public static SoundEvent PEACHDUDE_DEATH;
	public static SoundEvent PEACHDUDE_SCREAM;
	public static SoundEvent PEACHDUDE_BOING;
	
	public static void init() {
		PEACHDUDE_HURT = ModRegistry.registerSound("peachdude.hurt", Reference.MOD_ID);
		PEACHDUDE_DEATH = ModRegistry.registerSound("peachdude.death", Reference.MOD_ID);
		PEACHDUDE_SCREAM = ModRegistry.registerSound("peachdude.scream", Reference.MOD_ID);
		PEACHDUDE_BOING = ModRegistry.registerSound("peachdude.boing", Reference.MOD_ID);
	}
}
