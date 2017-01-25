/* Generated SBE (Simple Binary Encoding) message codec */
package baseline;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"baseline.ClassroomEncoder"})
@SuppressWarnings("all")
public class ClassroomEncoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final ClassroomEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public int offset()
    {
        return offset;
    }

    public ClassroomEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    private final StudentsEncoder students = new StudentsEncoder();

    public static long studentsId()
    {
        return 2;
    }

    public StudentsEncoder studentsCount(final int count)
    {
        students.wrap(parentMessage, buffer, count);
        return students;
    }

    public static class StudentsEncoder
    {
        private static final int HEADER_SIZE = 4;
        private final GroupSizeEncodingEncoder dimensions = new GroupSizeEncodingEncoder();
        private ClassroomEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final ClassroomEncoder parentMessage, final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 65534)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit());
            dimensions.blockLength((int)16);
            dimensions.numInGroup((int)count);
            index = -1;
            this.count = count;
            blockLength = 16;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 16;
        }

        public StudentsEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int yearNullValue()
        {
            return 65535;
        }

        public static int yearMinValue()
        {
            return 0;
        }

        public static int yearMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder year(final int value)
        {
            buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int uuidNullValue()
        {
            return 65535;
        }

        public static int uuidMinValue()
        {
            return 0;
        }

        public static int uuidMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder uuid(final int value)
        {
            buffer.putShort(offset + 2, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public StudentsEncoder shirtSize(final ShirtSize value)
        {
            buffer.putByte(offset + 4, (byte)value.value());
            return this;
        }

        public static byte shirtColorNullValue()
        {
            return (byte)0;
        }

        public static byte shirtColorMinValue()
        {
            return (byte)32;
        }

        public static byte shirtColorMaxValue()
        {
            return (byte)126;
        }

        public StudentsEncoder shirtColor(final byte value)
        {
            buffer.putByte(offset + 5, value);
            return this;
        }


        public static int gpaNullValue()
        {
            return 65535;
        }

        public static int gpaMinValue()
        {
            return 0;
        }

        public static int gpaMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder gpa(final int value)
        {
            buffer.putShort(offset + 6, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int numTotalNullValue()
        {
            return 65535;
        }

        public static int numTotalMinValue()
        {
            return 0;
        }

        public static int numTotalMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder numTotal(final int value)
        {
            buffer.putShort(offset + 8, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int numTurnedInNullValue()
        {
            return 65535;
        }

        public static int numTurnedInMinValue()
        {
            return 0;
        }

        public static int numTurnedInMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder numTurnedIn(final int value)
        {
            buffer.putShort(offset + 10, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int numLateNullValue()
        {
            return 65535;
        }

        public static int numLateMinValue()
        {
            return 0;
        }

        public static int numLateMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder numLate(final int value)
        {
            buffer.putShort(offset + 12, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int deskNullValue()
        {
            return 65535;
        }

        public static int deskMinValue()
        {
            return 0;
        }

        public static int deskMaxValue()
        {
            return 65534;
        }

        public StudentsEncoder desk(final int value)
        {
            buffer.putShort(offset + 14, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int firstNameId()
        {
            return 3;
        }

        public static String firstNameCharacterEncoding()
        {
            return "UTF-8";
        }

        public static String firstNameMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
        }

        public static int firstNameHeaderLength()
        {
            return 4;
        }

        public StudentsEncoder putFirstName(final DirectBuffer src, final int srcOffset, final int length)
        {
            if (length > 1073741824)
            {
                throw new IllegalArgumentException("length > max value for type: " + length);
            }

            final int headerLength = 4;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + headerLength + length);
            buffer.putInt(limit, (int)length, java.nio.ByteOrder.LITTLE_ENDIAN);
            buffer.putBytes(limit + headerLength, src, srcOffset, length);

            return this;
        }

        public StudentsEncoder putFirstName(final byte[] src, final int srcOffset, final int length)
        {
            if (length > 1073741824)
            {
                throw new IllegalArgumentException("length > max value for type: " + length);
            }

            final int headerLength = 4;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + headerLength + length);
            buffer.putInt(limit, (int)length, java.nio.ByteOrder.LITTLE_ENDIAN);
            buffer.putBytes(limit + headerLength, src, srcOffset, length);

            return this;
        }

        public StudentsEncoder firstName(final String value)
        {
            final byte[] bytes;
            try
            {
                bytes = value.getBytes("UTF-8");
            }
            catch (final java.io.UnsupportedEncodingException ex)
            {
                throw new RuntimeException(ex);
            }

            final int length = bytes.length;
            System.out.println("length: " + length);
            if (length > 1073741824)
            {
                throw new IllegalArgumentException("length > max value for type: " + length);
            }

            final int headerLength = 4;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + headerLength + length);
            buffer.putInt(limit, (int)length, java.nio.ByteOrder.LITTLE_ENDIAN);
            buffer.putBytes(limit + headerLength, bytes, 0, length);

            return this;
        }
    }

    private final DesksEncoder desks = new DesksEncoder();

    public static long desksId()
    {
        return 14;
    }

    public DesksEncoder desksCount(final int count)
    {
        desks.wrap(parentMessage, buffer, count);
        return desks;
    }

    public static class DesksEncoder
    {
        private static final int HEADER_SIZE = 4;
        private final GroupSizeEncodingEncoder dimensions = new GroupSizeEncodingEncoder();
        private ClassroomEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final ClassroomEncoder parentMessage, final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 65534)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit());
            dimensions.blockLength((int)4);
            dimensions.numInGroup((int)count);
            index = -1;
            this.count = count;
            blockLength = 4;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 4;
        }

        public DesksEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int surfaceAreaNullValue()
        {
            return 65535;
        }

        public static int surfaceAreaMinValue()
        {
            return 0;
        }

        public static int surfaceAreaMaxValue()
        {
            return 65534;
        }

        public DesksEncoder surfaceArea(final int value)
        {
            buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int numChairsNullValue()
        {
            return 65535;
        }

        public static int numChairsMinValue()
        {
            return 0;
        }

        public static int numChairsMaxValue()
        {
            return 65534;
        }

        public DesksEncoder numChairs(final int value)
        {
            buffer.putShort(offset + 2, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

    }
    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        ClassroomDecoder writer = new ClassroomDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}
