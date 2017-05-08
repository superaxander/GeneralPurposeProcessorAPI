package alexanders.api.gpprocessor;

public class DataLine extends CastedValueProvider
{
    private IComponent in;
    private IComponent out;

    public DataLine(IComponent in, IComponent out)
    {
        this.in = in;
        this.out = out;
    }

    public DataLine()
    {
    }

    public String getType()
    {
        return getClass().getName();
    }

    public IComponent getIn()
    {
        return in;
    }

    public void setIn(IComponent in)
    {
        this.in = in;
    }

    public IComponent getOut()
    {
        return out;
    }

    public void setOut(IComponent out)
    {
        this.out = out;
    }
}
