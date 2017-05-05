package alexanders.api.gpprocessor;

import java.util.logging.Level;

public abstract class CastedValueProvider
{
    protected Object value;

    public Object getObjectValue()
    {
        return value;
    }

    public String getStringValue()
    {
        return (String) value;
    }

    public boolean getBooleanValue()
    {
        return (boolean) value;
    }

    public byte getByteValue()
    {
        return (byte) value;
    }

    public char getCharacterValue()
    {
        return (char) value;
    }

    public double getDoubleValue()
    {
        return (double) value;
    }

    public float getFloatValue()
    {
        return (float) value;
    }

    public int getIntegerValue()
    {
        return (int) value;
    }

    public long getLongValue()
    {
        return (long) value;
    }


    public short getShortValue()
    {
        return (short) value;
    }

    public String[] getStringArrayValue()
    {
        return (String[]) value;
    }

    public boolean[] getBooleanArrayValue()
    {
        return (boolean[]) value;
    }

    public byte[] getByteArrayValue()
    {
        return (byte[]) value;
    }

    public char[] getCharacterArrayValue()
    {
        return (char[]) value;
    }

    public double[] getDoubleArrayValue()
    {
        return (double[]) value;
    }

    public float[] getFloatArrayValue()
    {
        return (float[]) value;
    }

    public int[] getIntegerArrayValue()
    {
        return (int[]) value;
    }

    public long[] getLongArrayArrayValue()
    {
        return (long[]) value;
    }


    public short[] getShortArrayValue()
    {
        return (short[]) value;
    }

    public <T> T getValueOfType(Class<? extends T> type)
    {
        ClassCastException potentialException = null;
        String msg = "Tried to cast a value of type: " + value.getClass().getSimpleName() + " to type: " + type.getSimpleName();
        try
        {
            if (type.isAssignableFrom(value.getClass()))
                //noinspection unchecked
                return (T) value;
        } catch (ClassCastException e)
        {
            potentialException = e;
        }
        Reference.logger.logp(Level.SEVERE, this.getClass().getSimpleName(), "getValueOfType", msg);
        throw potentialException == null ? new ClassCastException(msg) : potentialException;
    }
}
