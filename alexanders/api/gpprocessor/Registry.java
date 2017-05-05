package alexanders.api.gpprocessor;

import java.util.HashMap;
import java.util.logging.Logger;

public abstract class Registry<T>
{
    protected final HashMap<String, T> registry;
    protected final String name;
    protected final Logger pluginLogger;

    protected boolean hasRegistered;

    protected Registry(String name, Logger pluginLogger)
    {
        this.name = name;
        this.registry = new HashMap<>();
        this.pluginLogger = pluginLogger;
    }

    protected void addAll(HashMap<String, T> base)
    {
        registry.putAll(base);
        if (hasRegistered)
            base.forEach(this::register);
    }

    protected void add(String name, T registrant)
    {
        registry.put(name, registrant);
        if (hasRegistered)
            register(name, registrant);
    }

    public void register()
    {
        this.hasRegistered = true;
        registerInternal();
    }

    protected void registerInternal()
    {
        pluginLogger.fine("Registry " + name + " is using standard registry methods");
        registry.forEach(this::register);
    }

    private void register(String name, T registrant)
    {
        pluginLogger.fine("Registry " + name + " is registering: " + registrant.toString());
        registerInternal(name, registrant);
    }

    protected abstract void registerInternal(String name, T registrant);

    public T get(String name)
    {
        return registry.get(name);
    }
}
