/* Generated SBE (Simple Binary Encoding) message codec */
package baseline;

@javax.annotation.Generated(value = {"baseline.ShirtSize"})
public enum ShirtSize
{
    XS((short)0),
    S((short)1),
    M((short)2),
    L((short)3),
    XL((short)4),
    NULL_VAL((short)255);

    private final short value;

    ShirtSize(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static ShirtSize get(final short value)
    {
        switch (value)
        {
            case 0: return XS;
            case 1: return S;
            case 2: return M;
            case 3: return L;
            case 4: return XL;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
