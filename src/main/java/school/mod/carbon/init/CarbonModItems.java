
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package school.mod.carbon.init;

import school.mod.carbon.item.SteelItem;
import school.mod.carbon.item.CarbonElementIconItem;
import school.mod.carbon.CarbonMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class CarbonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CarbonMod.MODID);
	public static final RegistryObject<Item> CARBON_ELEMENT_ICON = REGISTRY.register("carbon_element_icon", () -> new CarbonElementIconItem());
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> STEEL_BEAM = block(CarbonModBlocks.STEEL_BEAM, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
