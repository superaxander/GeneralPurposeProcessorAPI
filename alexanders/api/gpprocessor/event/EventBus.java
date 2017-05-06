package alexanders.api.gpprocessor.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

public abstract class EventBus
{
    protected Map<String, Map<String, ArrayList<Method>>> eventHandlerMap; // event, Map<pluginID, eventHandlerMethods>

    public abstract void register(String pluginID, Object eventHandler);

    public abstract void register(String pluginID, Method eventHandlerMethod);

    protected abstract void register(String pluginID, Method eventHandlerMethod, String event);

    public abstract void fireEvent(GPPEvent event);

    public String getID()
    {
        return getClass().getSimpleName();
    }

}
