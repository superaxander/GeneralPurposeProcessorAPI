package alexanders.api.gpprocessor;

public class Container<V>
{
    public V value;

    public Container()
    {
        value = null;
    }

    public Container(V value)
    {
        this.value = value;
    }
}
