package rxs.dedouwe.mcmods.opmod_renewd.procedures;

import rxs.dedouwe.mcmods.opmod_renewd.OpmodModVariables;
import rxs.dedouwe.mcmods.opmod_renewd.OpmodModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@OpmodModElements.ModElement.Tag
public class XBindingOnKeyPressedProcedure extends OpmodModElements.ModElement {
	public XBindingOnKeyPressedProcedure(OpmodModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure XBindingOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (boolean) (true);
			entity.getCapability(OpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Tnt_drop = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
