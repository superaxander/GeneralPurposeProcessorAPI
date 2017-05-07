package alexanders.api.gpprocessor.event;

public class GPPEvent
{
    public String getType()
    {
        return getClass().getSimpleName();
    }
}
