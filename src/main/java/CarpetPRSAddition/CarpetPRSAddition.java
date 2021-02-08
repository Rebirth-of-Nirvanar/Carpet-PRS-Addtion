package CarpetPRSAddition;

import CarpetPRSAddition.utils.CarpetPRSAdditionTranslations;
import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.settings.SettingsManager;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.Map;

public class CarpetPRSAddition implements CarpetExtension
{
    public static final String version = "1.0.0";
    public static void noop() { }
    private static SettingsManager mySettingManager;
    static
    {
        mySettingManager = new SettingsManager(version, "carpetPRSAddition", "carpet PRS Addition");
        CarpetServer.manageExtension(new CarpetPRSAddition());
    }

    @Override
    public void onGameStarted()
    {
        CarpetServer.settingsManager.parseSettingsClass(CarpetPRSAdditionSettings.class);
    }

    @Override
    public void onServerLoaded(MinecraftServer server)
    {
        // reloading of /carpet settings is handled by carpet
        // reloading of own settings is handled as an extension, since we claim own settings manager
    }

    @Override
    public void onTick(MinecraftServer server)
    {
        // no need to add this.
    }

    @Override
    public void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher)
    {
        //
    }

    @Override
    public void onPlayerLoggedIn(ServerPlayerEntity player)
    {
        //
    }

    @Override
    public void onPlayerLoggedOut(ServerPlayerEntity player)
    {
        //
    }

    @Override
    public Map<String, String> canHasTranslations(String lang)
    {
        return CarpetPRSAdditionTranslations.getTranslationFromResourcePath(lang);
    }
}
