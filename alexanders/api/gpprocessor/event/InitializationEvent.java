package alexanders.api.gpprocessor.event;

import alexanders.api.gpprocessor.plugin.LoadState;

import java.util.Map;

public class InitializationEvent extends GPPEvent
{
    private Map<String, LoadState> plugins;

    public InitializationEvent(Map<String, LoadState> plugins)
    {
        this.plugins = plugins;
    }

    public Map<String, LoadState> getPlugins()
    {
        return plugins;
    }
}
