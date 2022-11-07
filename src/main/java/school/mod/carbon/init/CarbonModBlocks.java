
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package school.mod.carbon.init;

import school.mod.carbon.block.SteelBeamBlock;
import school.mod.carbon.CarbonMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CarbonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CarbonMod.MODID);
	public static final RegistryObject<Block> STEEL_BEAM = REGISTRY.register("steel_beam", () -> new SteelBeamBlock());
}
