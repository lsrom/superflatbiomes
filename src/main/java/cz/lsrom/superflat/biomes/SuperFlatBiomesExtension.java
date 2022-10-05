package cz.lsrom.superflat.biomes;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.api.settings.SettingsManager;
import carpet.utils.Translations;
import net.fabricmc.api.ModInitializer;

import java.util.Map;

public class SuperFlatBiomesExtension implements CarpetExtension, ModInitializer {

    private static SettingsManager settingsManager;

    public SuperFlatBiomesExtension() {
        CarpetServer.manageExtension(this);
    }

    @Override
    public void onInitialize() {
        settingsManager = new SettingsManager("1.0", "superflatbiomes", "Super Flat with Biomes");
        SuperFlatBiomesPresets.registerAll();
    }

    @Override
    public void onGameStarted() {
        settingsManager.parseSettingsClass(SuperFlatBiomesSettings.class);
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        return Translations.getTranslationFromResourcePath(String.format("assets/%s/lang/%s.json", "superflatbiomes", lang));
    }

    @Override
    public SettingsManager extensionSettingsManager() {
        return settingsManager;
    }
}
