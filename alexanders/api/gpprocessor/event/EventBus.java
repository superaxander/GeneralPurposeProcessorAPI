package alexanders.api.gpprocessor.event;

import java.util.Map;

public abstract class EventBus
{
    protected Map<Class<? extends GPPEvent>, Map<String, Object>> eventHandlerMap;

    public abstract void register(String pluginID, Object eventHandler);

    public abstract void fireEvent(GPPEvent event);

    public String getID()
    {
        return getClass().getSimpleName();
    }

}
