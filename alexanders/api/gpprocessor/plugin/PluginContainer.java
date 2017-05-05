package alexanders.api.gpprocessor.plugin;

import java.util.List;

public abstract class PluginContainer
{
    public abstract String getName();

    public abstract String getID();

    public abstract LoadState getState();

    public abstract boolean isAcceptingMessages();

    public abstract void sendMessage(IPCMessage message);

    public abstract List<Thread> getThreads();

    public abstract String[] getDependencies();
}
