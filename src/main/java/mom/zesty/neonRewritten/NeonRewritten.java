package mom.zesty.neonRewritten;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NeonRewritten extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Loading Neon Rewritten!");
        getLogger().info(" | Running on Java " + System.getProperty("java.version"));
        getLogger().info(" | Server version " + Bukkit.getVersion());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
