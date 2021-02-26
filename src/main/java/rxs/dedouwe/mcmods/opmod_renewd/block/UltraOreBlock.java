
package rxs.dedouwe.mcmods.opmod_renewd.block;

import rxs.dedouwe.mcmods.opmod_renewd.itemgroup.OpItemsItemGroup;
import rxs.dedouwe.mcmods.opmod_renewd.item.UltraItemItem;
import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.MobEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@OpmodModElements.ModElement.Tag
public class UltraOreBlock extends OpmodModElements.ModElement {
	@ObjectHolder("opmod:ultra_ore")
	public static final Block block = null;
	public UltraOreBlock(OpmodModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(OpItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f, 14.5f).lightValue(0));
			setRegistryName("ultra_ore");
		}

		@Override
		public PathNodeType getAiPathNodeType(BlockState state, IBlockReader world, BlockPos pos, MobEntity entity) {
			return PathNodeType.WALKABLE;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(UltraItemItem.block, (int) (1)));
		}
	}
}
