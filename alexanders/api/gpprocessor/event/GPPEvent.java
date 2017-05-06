package alexanders.api.gpprocessor.event;

public class GPPEvent
{
    public GPPEvent() // Always allow empty constructor for type checking
    {
    }

    public String getType()
    {
        return getClass().getSimpleName();
    }
}
