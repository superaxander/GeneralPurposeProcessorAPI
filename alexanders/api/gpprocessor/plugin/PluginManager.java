package alexanders.api.gpprocessor.plugin;

import alexanders.api.gpprocessor.IComponent;
import alexanders.api.gpprocessor.Reference;
import alexanders.api.gpprocessor.Registry;
import alexanders.api.gpprocessor.capability.Capability;
import alexanders.api.gpprocessor.event.EventBus;

public abstract class PluginManager extends Registry<EventBus>
{
    public static PluginManager instance;

    public abstract PluginContainer getPlugin(String pluginID);

    public abstract EventBus getMainEventBus();

    public abstract EventBus getEventBus(String eventBusID);

    public abstract void registerEventBus(EventBus eventBus);

    public abstract Registry<Capability> getCapabilityRegistry();

    public abstract Registry<IComponent> componentRegistry();

    private PluginManager()
    {
        super("EventBusRegistry", Reference.logger);
    }
}
