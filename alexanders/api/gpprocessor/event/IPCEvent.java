package alexanders.api.gpprocessor.event;

import alexanders.api.gpprocessor.plugin.IPCMessage;

public class IPCEvent
{
    private IPCMessage message;
    private String sender;

    public IPCEvent(IPCMessage message, String sender)
    {
        this.message = message;
        this.sender = sender;
    }

    public IPCMessage getMessage()
    {
        return message;
    }

    public String getSender()
    {
        return sender;
    }
}
