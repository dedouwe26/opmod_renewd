package rxs.dedouwe.mcmods.opmod_renewd.procedures;

import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import java.util.Map;

@OpmodModElements.ModElement.Tag
public class OpSwordItemIsCraftedsmeltedProcedure extends OpmodModElements.ModElement {
	public OpSwordItemIsCraftedsmeltedProcedure(OpmodModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure OpSwordItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.BANE_OF_ARTHROPODS, (int) 1000000);
		((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 1000000);
		((itemstack)).addEnchantment(Enchantments.SMITE, (int) 1000000);
		((itemstack)).addEnchantment(Enchantments.THORNS, (int) 1000000);
		((itemstack)).addEnchantment(Enchantments.EFFICIENCY, (int) 1000000);
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 1000000);
	}
}
