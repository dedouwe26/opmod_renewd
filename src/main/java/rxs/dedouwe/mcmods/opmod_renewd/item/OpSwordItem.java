
package rxs.dedouwe.mcmods.opmod_renewd.item;

import rxs.dedouwe.mcmods.opmod_renewd.itemgroup.OpItemsItemGroup;
import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@OpmodModElements.ModElement.Tag
public class OpSwordItem extends OpmodModElements.ModElement {
	@ObjectHolder("opmod:op_sword")
	public static final Item block = null;
	public OpSwordItem(OpmodModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(OpItemsItemGroup.tab)) {
		}.setRegistryName("op_sword"));
	}
}
