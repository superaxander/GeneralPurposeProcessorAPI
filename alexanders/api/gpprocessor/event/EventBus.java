package alexanders.api.gpprocessor.event;

import java.util.List;
import java.util.Map;

public abstract class EventBus
{
    protected Map<Class<? extends GPPEvent>, List<Object>> eventHandlerMap;

    public abstract void register(Object eventHandler);

    public abstract void fireEvent(GPPEvent event);

    public String getID()
    {
        return getClass().getSimpleName();
    }

}
