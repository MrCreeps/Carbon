
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package school.mod.carbon.init;

import school.mod.carbon.block.ToasterBlock;
import school.mod.carbon.block.SteelBeamBlock;
import school.mod.carbon.block.GrossEmeraldBlock;
import school.mod.carbon.block.CokeBlock;
import school.mod.carbon.CarbonMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class CarbonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CarbonMod.MODID);
	public static final RegistryObject<Block> STEEL_BEAM = REGISTRY.register("steel_beam", () -> new SteelBeamBlock());
	public static final RegistryObject<Block> TOASTER = REGISTRY.register("toaster", () -> new ToasterBlock());
	public static final RegistryObject<Block> GROSS_EMERALD = REGISTRY.register("gross_emerald", () -> new GrossEmeraldBlock());
	public static final RegistryObject<Block> COKE = REGISTRY.register("coke", () -> new CokeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ToasterBlock.registerRenderLayer();
		}
	}
}
