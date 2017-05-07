package alexanders.api.gpprocessor.event;

public class EventBusRegistrationEvent extends GPPEvent
{
    private EventBus newEventBus;

    public EventBusRegistrationEvent()
    {
    }

    public EventBusRegistrationEvent(EventBus newEventBus)
    {
        this.newEventBus = newEventBus;
    }

    public EventBus getNewEventBus()
    {
        return newEventBus;
    }
}
