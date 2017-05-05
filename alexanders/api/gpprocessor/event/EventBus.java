package alexanders.api.gpprocessor.event;

import java.lang.reflect.Method;
import java.util.Map;

public abstract class EventBus
{
    protected Map<Class<? extends GPPEvent>, Map<String, Object>> eventHandlerMap;

    public abstract void register(String pluginID, Object eventHandler);

    public abstract void register(String pluginID, Method eventHandlerMethod);

    public abstract void fireEvent(GPPEvent event);

    public String getID()
    {
        return getClass().getSimpleName();
    }

}
