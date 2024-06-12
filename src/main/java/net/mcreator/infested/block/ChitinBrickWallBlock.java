
package net.mcreator.infested.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class ChitinBrickWallBlock extends WallBlock {
	public ChitinBrickWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5f, 20f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
