package rxs.dedouwe.mcmods.opmod_renewd.procedures;

import rxs.dedouwe.mcmods.opmod_renewd.OpmodModVariables;
import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@OpmodModElements.ModElement.Tag
public class TntThrowerItemInInventoryTickProcedure extends OpmodModElements.ModElement {
	public TntThrowerItemInInventoryTickProcedure(OpmodModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TntThrowerItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(OpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new OpmodModVariables.PlayerVariables())).Tnt_drop) == (true))) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Item is in Inventory"), (false));
			}
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(OpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tnt_drop = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
