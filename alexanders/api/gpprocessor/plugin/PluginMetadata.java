package alexanders.api.gpprocessor.plugin;

public class PluginMetadata
{
    public String name;
    public String ID;
    public String version;
    public String author;
    public String description;

    public PluginMetadata()
    {
    }

    public PluginMetadata(String name, String ID, String version, String author, String description)
    {
        this.name = name;
        this.ID = ID;
        this.version = version;
        this.author = author;
        this.description = description;
    }
}
