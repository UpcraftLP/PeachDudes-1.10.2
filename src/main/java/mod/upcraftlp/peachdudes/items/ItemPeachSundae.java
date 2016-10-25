package mod.upcraftlp.peachdudes.items;

import java.util.Random;

import core.upcraftlp.craftdev.API.templates.ItemFood;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class ItemPeachSundae extends ItemFood {

	Random random = new Random();
	
	public ItemPeachSundae() {
		super("peach_sundae", 25, 1.3f, false);
		this.setMaxStackSize(1);
		this.setPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 4), 1.0f);
		this.setAlwaysEdible();
	}	
}
