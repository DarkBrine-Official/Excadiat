
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
public class BlockBronzeBlock extends ElementsZaderMod.ModElement {
	@GameRegistry.ObjectHolder("zadermod:bronzeblock")
	public static final Block block = null;
	public BlockBronzeBlock(ElementsZaderMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bronzeblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("zadermod:bronzeblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("bronzeblock");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(3F);
			setResistance(30F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabExcadiat.tab);
		}
	}
}
