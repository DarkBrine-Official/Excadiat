
package me.aternos.zaderlyl.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import me.aternos.zaderlyl.creativetab.TabExcadiat;
import me.aternos.zaderlyl.ElementsZaderMod;

@ElementsZaderMod.ModElement.Tag
public class BlockNetheriumArk extends ElementsZaderMod.ModElement {
	@GameRegistry.ObjectHolder("zadermod:netheriumark")
	public static final Block block = null;
	public BlockNetheriumArk(ElementsZaderMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("netheriumark"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("zadermod:netheriumark", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("netheriumark");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabExcadiat.tab);
		}
	}
}
