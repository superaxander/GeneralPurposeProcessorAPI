package alexanders.api.gpprocessor;

import java.util.function.BiConsumer;

public class Pair<K, V>
{
    public K key;
    public V value;

    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public void forEach(BiConsumer<K, V> biConsumer)
    {
        biConsumer.accept(key, value);
    }
}
