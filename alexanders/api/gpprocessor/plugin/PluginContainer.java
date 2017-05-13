package alexanders.api.gpprocessor.plugin;

public abstract class PluginContainer
{
    public abstract String getName();

    public abstract String getID();

    public abstract LoadState getState();

    public abstract boolean isAcceptingMessages();

    public abstract void sendMessage(String sender, IPCMessage message);

    public abstract String[] getDependencies();

    public abstract Class<?> getPluginClass();

    public abstract Object getInstance();

    public abstract PluginMetadata getMetadata();
    
    public abstract ClassLoader getClassLoader();
}
