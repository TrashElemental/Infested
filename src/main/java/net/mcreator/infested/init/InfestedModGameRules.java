
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InfestedModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DISABLE_SILVERFISH_TRAP = GameRules.register("disableSilverfishTrap", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
