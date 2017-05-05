package alexanders.api.gpprocessor.event;

import alexanders.api.gpprocessor.plugin.LoadState;
import alexanders.api.gpprocessor.plugin.PluginMetadata;

import java.io.File;
import java.util.Map;
import java.util.logging.Logger;

public class PreInitializationEvent extends GPPEvent
{
    private Logger logger;
    private File configurationFolder;
    private File configurationFile;
    private PluginMetadata metadata;
    private Map<String, LoadState> plugins;

    public PreInitializationEvent(Logger logger, File configurationFolder, File configurationFile, PluginMetadata metadata, Map<String, LoadState> plugins)
    {
        this.logger = logger;
        this.configurationFolder = configurationFolder;
        this.configurationFile = configurationFile;
        this.metadata = metadata;
        this.plugins = plugins;
    }

    public Logger getLogger()
    {
        return logger;
    }

    public File getConfigurationFolder()
    {
        return configurationFolder;
    }

    public File getConfigurationFile()
    {
        return configurationFile;
    }

    public PluginMetadata getMetadata()
    {
        return metadata;
    }

    public Map<String, LoadState> getPlugins()
    {
        return plugins;
    }
}
