package alexanders.api.gpprocessor.plugin;

import alexanders.api.gpprocessor.CastedValueProvider;

public class IPCMessage extends CastedValueProvider
{
    private String key;

    public IPCMessage(String key, Object value)
    {
        this.key = key;
        this.value = value;
    }
}
