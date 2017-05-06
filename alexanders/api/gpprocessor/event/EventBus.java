package alexanders.api.gpprocessor.event;

import alexanders.api.gpprocessor.Pair;
import alexanders.api.gpprocessor.Triplet;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class EventBus
{
    protected Map<String, Map<String, List<Pair<Object, Method>>>> eventHandlerMap;

    public abstract void register(String pluginID, Object eventHandler);

    public abstract void register(String pluginID, Object eventHandler, Method eventHandlerMethod);

    protected abstract void register(String pluginID, Object eventHandler, Method eventHandlerMethod, String event);

    public abstract void fireEvent(GPPEvent event);

    public abstract void fireEventAt(String pluginID, GPPEvent event);

    public String getID()
    {
        return getClass().getSimpleName();
    }

    public static final ArrayList<Triplet<GPPEvent, Object, Method>> scheduledEvents = new ArrayList<>();
}
