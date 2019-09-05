package celestia.forward.utils;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.Field;
import java.util.List;

public class LootUtilities
{
    private static final Field f = ReflectionHelper.findField(LootTable.class, "pools", "field_186466_c");

    @SuppressWarnings("unchecked")
    public static void addLootPools(LootTableManager mgr, LootTable table, ResourceLocation pools)
    {
        LootTable extra = mgr.getLootTableFromLocation(pools);

        try
        {
            for (LootPool pool : (List<LootPool>) f.get(extra))
                ((List<LootPool>) f.get(table)).add(pool);
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
