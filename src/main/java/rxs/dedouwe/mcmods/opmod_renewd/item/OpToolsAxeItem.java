
package rxs.dedouwe.mcmods.opmod_renewd.item;

import rxs.dedouwe.mcmods.opmod_renewd.itemgroup.OpItemsItemGroup;
import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@OpmodModElements.ModElement.Tag
public class OpToolsAxeItem extends OpmodModElements.ModElement {
	@ObjectHolder("opmod:op_tools_axe")
	public static final Item block = null;
	public OpToolsAxeItem(OpmodModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return 88f;
			}

			public int getHarvestLevel() {
				return 128000;
			}

			public int getEnchantability() {
				return 128000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(UltraMagicCernItem.block, (int) (1)));
			}
		}, 1, 96f, new Item.Properties().group(OpItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("op_tools_axe"));
	}
}
