package alexanders.api.gpprocessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtil
{
    public static <K, V> void addToEmbeddedList(Map<K, List<V>> map, K key, V value)
    {
        if (map.containsKey(key))
        {
            map.get(key).add(value);
        } else
        {
            List<V> list = new ArrayList<V>()
            {{
                add(value);
            }};
            map.put(key, list);
        }
    }

    public static <K1, K2, V> void addToEmbeddedMap(Map<K1, Map<K2, V>> map, K1 key1, K2 key2, V value)
    {
        if (map.containsKey(key1))
        {
            map.get(key1).put(key2, value);
        } else
        {
            Map<K2, V> intMap = new HashMap<K2, V>()
            {{
                put(key2, value);
            }};
            map.put(key1, intMap);
        }
    }

    public static <K1, K2, V> void addToEmbeddedListInEmbeddedMap(Map<K1, Map<K2, List<V>>> map, K1 key1, K2 key2, V value)
    {
        if (map.containsKey(key1))
        {
            Map<K2, List<V>> intMap = map.get(key1);
            if (intMap.containsKey(key2))
            {
                intMap.get(key2).add(value);
            } else
            {
                intMap.put(key2, new ArrayList<V>()
                {{
                    add(value);
                }});
            }
        } else
        {
            map.put(key1, new HashMap<K2, List<V>>()
            {{
                put(key2, new ArrayList<V>()
                {{
                    add(value);
                }});
            }});
        }
    }
}
