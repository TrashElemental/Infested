
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.infested.block.SpinneretBlock;
import net.mcreator.infested.block.SilverfishTrapBlock;
import net.mcreator.infested.block.CobwebTrapBlock;
import net.mcreator.infested.block.ChitinWallBlock;
import net.mcreator.infested.block.ChitinStairsBlock;
import net.mcreator.infested.block.ChitinSlabBlock;
import net.mcreator.infested.block.ChitinBricksBlock;
import net.mcreator.infested.block.ChitinBrickWallBlock;
import net.mcreator.infested.block.ChitinBrickStairsBlock;
import net.mcreator.infested.block.ChitinBrickSlabBlock;
import net.mcreator.infested.block.ChitinBlockBlock;
import net.mcreator.infested.block.ChiseledChitinBricksBlock;
import net.mcreator.infested.InfestedMod;

public class InfestedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InfestedMod.MODID);
	public static final RegistryObject<Block> COBWEB_TRAP = REGISTRY.register("cobweb_trap", () -> new CobwebTrapBlock());
	public static final RegistryObject<Block> SPINNERET = REGISTRY.register("spinneret", () -> new SpinneretBlock());
	public static final RegistryObject<Block> SILVERFISH_TRAP = REGISTRY.register("silverfish_trap", () -> new SilverfishTrapBlock());
	public static final RegistryObject<Block> CHITIN_BLOCK = REGISTRY.register("chitin_block", () -> new ChitinBlockBlock());
	public static final RegistryObject<Block> CHITIN_SLAB = REGISTRY.register("chitin_slab", () -> new ChitinSlabBlock());
	public static final RegistryObject<Block> CHITIN_STAIRS = REGISTRY.register("chitin_stairs", () -> new ChitinStairsBlock());
	public static final RegistryObject<Block> CHITIN_WALL = REGISTRY.register("chitin_wall", () -> new ChitinWallBlock());
	public static final RegistryObject<Block> CHITIN_BRICKS = REGISTRY.register("chitin_bricks", () -> new ChitinBricksBlock());
	public static final RegistryObject<Block> CHITIN_BRICK_SLAB = REGISTRY.register("chitin_brick_slab", () -> new ChitinBrickSlabBlock());
	public static final RegistryObject<Block> CHITIN_BRICK_STAIRS = REGISTRY.register("chitin_brick_stairs", () -> new ChitinBrickStairsBlock());
	public static final RegistryObject<Block> CHITIN_BRICK_WALL = REGISTRY.register("chitin_brick_wall", () -> new ChitinBrickWallBlock());
	public static final RegistryObject<Block> CHISELED_CHITIN_BRICKS = REGISTRY.register("chiseled_chitin_bricks", () -> new ChiseledChitinBricksBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
