package alexanders.api.gpprocessor.capability;

public class Capability<T>
{
    private CapabilityFactory<T> factory;

    public String getType()
    {
        return getDefaultInstance().getClass().getSimpleName();
    }

    public T getDefaultInstance()
    {
        return factory.apply(null);
    }
}
