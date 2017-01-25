/* Generated SBE (Simple Binary Encoding) message codec */
package baseline;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"baseline.ClassroomDecoder"})
@SuppressWarnings("all")
public class ClassroomDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final ClassroomDecoder parentMessage = this;
    private DirectBuffer buffer;
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

    public ClassroomDecoder wrap(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

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

    private final StudentsDecoder students = new StudentsDecoder();

    public static long studentsDecoderId()
    {
        return 2;
    }

    public static int studentsDecoderSinceVersion()
    {
        return 0;
    }

    public StudentsDecoder students()
    {
        students.wrap(parentMessage, buffer);
        return students;
    }

    public static class StudentsDecoder
        implements Iterable<StudentsDecoder>, java.util.Iterator<StudentsDecoder>
    {
        private static final int HEADER_SIZE = 4;
        private final GroupSizeEncodingDecoder dimensions = new GroupSizeEncodingDecoder();
        private ClassroomDecoder parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final ClassroomDecoder parentMessage, final DirectBuffer buffer)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            dimensions.wrap(buffer, parentMessage.limit());
            blockLength = dimensions.blockLength();
            count = dimensions.numInGroup();
            index = -1;
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

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<StudentsDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public StudentsDecoder next()
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

        public static int yearId()
        {
            return 5;
        }

        public static int yearSinceVersion()
        {
            return 0;
        }

        public static String yearMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int year()
        {
            return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int uuidId()
        {
            return 6;
        }

        public static int uuidSinceVersion()
        {
            return 0;
        }

        public static String uuidMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int uuid()
        {
            return (buffer.getShort(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int shirtSizeId()
        {
            return 7;
        }

        public static int shirtSizeSinceVersion()
        {
            return 0;
        }

        public static String shirtSizeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
        }

        public ShirtSize shirtSize()
        {
            return ShirtSize.get(((short)(buffer.getByte(offset + 4) & 0xFF)));
        }


        public static int shirtColorId()
        {
            return 8;
        }

        public static int shirtColorSinceVersion()
        {
            return 0;
        }

        public static String shirtColorMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public byte shirtColor()
        {
            return buffer.getByte(offset + 5);
        }


        public static int gpaId()
        {
            return 9;
        }

        public static int gpaSinceVersion()
        {
            return 0;
        }

        public static String gpaMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int gpa()
        {
            return (buffer.getShort(offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int numTotalId()
        {
            return 10;
        }

        public static int numTotalSinceVersion()
        {
            return 0;
        }

        public static String numTotalMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int numTotal()
        {
            return (buffer.getShort(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int numTurnedInId()
        {
            return 11;
        }

        public static int numTurnedInSinceVersion()
        {
            return 0;
        }

        public static String numTurnedInMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int numTurnedIn()
        {
            return (buffer.getShort(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int numLateId()
        {
            return 12;
        }

        public static int numLateSinceVersion()
        {
            return 0;
        }

        public static String numLateMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int numLate()
        {
            return (buffer.getShort(offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int deskId()
        {
            return 13;
        }

        public static int deskSinceVersion()
        {
            return 0;
        }

        public static String deskMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int desk()
        {
            return (buffer.getShort(offset + 14, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int firstNameId()
        {
            return 3;
        }

        public static int firstNameSinceVersion()
        {
            return 0;
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

        public int firstNameLength()
        {
            final int limit = parentMessage.limit();
            return (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        }

        public int getFirstName(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 4;
            final int limit = parentMessage.limit();
            final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);
            System.out.println("bytes copied: " + dataLength);
            return bytesCopied;
        }

        public int getFirstName(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 4;
            final int limit = parentMessage.limit();
            final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public String firstName()
        {
            final int headerLength = 4;
            final int limit = parentMessage.limit();
            final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
            parentMessage.limit(limit + headerLength + dataLength);
            final byte[] tmp = new byte[dataLength];
            buffer.getBytes(limit + headerLength, tmp, 0, dataLength);

            final String value;
            try
            {
                value = new String(tmp, "UTF-8");
            }
            catch (final java.io.UnsupportedEncodingException ex)
            {
                throw new RuntimeException(ex);
            }

            return value;
        }

        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='year', description='null', id=5, version=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='Year', description='null', id=-1, version=0, encodedLength=2, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("year=");
            builder.append(year());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='uuid', description='null', id=6, version=0, encodedLength=0, offset=2, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='UUID', description='null', id=-1, version=0, encodedLength=2, offset=2, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("uuid=");
            builder.append(uuid());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='ShirtSize', description='null', id=7, version=0, encodedLength=0, offset=4, componentTokenCount=9, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=BEGIN_ENUM, name='ShirtSize', description='null', id=-1, version=0, encodedLength=1, offset=4, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
            builder.append("shirtSize=");
            builder.append(shirtSize());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='ShirtColor', description='null', id=8, version=0, encodedLength=0, offset=5, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='ShirtColor', description='null', id=-1, version=0, encodedLength=1, offset=5, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='char', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("shirtColor=");
            builder.append(shirtColor());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='gpa', description='null', id=9, version=0, encodedLength=0, offset=6, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='GPA', description='null', id=-1, version=0, encodedLength=2, offset=6, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("gpa=");
            builder.append(gpa());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='NumTotal', description='null', id=10, version=0, encodedLength=0, offset=8, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='NumTotal', description='null', id=-1, version=0, encodedLength=2, offset=8, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("numTotal=");
            builder.append(numTotal());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='numTurnedIn', description='null', id=11, version=0, encodedLength=0, offset=10, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='NumTurnedIn', description='null', id=-1, version=0, encodedLength=2, offset=10, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("numTurnedIn=");
            builder.append(numTurnedIn());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='numLate', description='null', id=12, version=0, encodedLength=0, offset=12, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='NumLate', description='null', id=-1, version=0, encodedLength=2, offset=12, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("numLate=");
            builder.append(numLate());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='desk', description='null', id=13, version=0, encodedLength=0, offset=14, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='Desk', description='null', id=-1, version=0, encodedLength=2, offset=14, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("desk=");
            builder.append(desk());
            builder.append('|');
            //Token{signal=BEGIN_VAR_DATA, name='firstName', description='null', id=3, version=0, encodedLength=0, offset=16, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("firstName=");
            builder.append(firstName());
            builder.append(')');
            return builder;
        }
    }

    private final DesksDecoder desks = new DesksDecoder();

    public static long desksDecoderId()
    {
        return 14;
    }

    public static int desksDecoderSinceVersion()
    {
        return 0;
    }

    public DesksDecoder desks()
    {
        desks.wrap(parentMessage, buffer);
        return desks;
    }

    public static class DesksDecoder
        implements Iterable<DesksDecoder>, java.util.Iterator<DesksDecoder>
    {
        private static final int HEADER_SIZE = 4;
        private final GroupSizeEncodingDecoder dimensions = new GroupSizeEncodingDecoder();
        private ClassroomDecoder parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final ClassroomDecoder parentMessage, final DirectBuffer buffer)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            dimensions.wrap(buffer, parentMessage.limit());
            blockLength = dimensions.blockLength();
            count = dimensions.numInGroup();
            index = -1;
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

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<DesksDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public DesksDecoder next()
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

        public static int surfaceAreaId()
        {
            return 15;
        }

        public static int surfaceAreaSinceVersion()
        {
            return 0;
        }

        public static String surfaceAreaMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int surfaceArea()
        {
            return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public static int numChairsId()
        {
            return 16;
        }

        public static int numChairsSinceVersion()
        {
            return 0;
        }

        public static String numChairsMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "";
            }

            return "";
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

        public int numChairs()
        {
            return (buffer.getShort(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='surfaceArea', description='null', id=15, version=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='SurfaceArea', description='null', id=-1, version=0, encodedLength=2, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("surfaceArea=");
            builder.append(surfaceArea());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='numChairs', description='null', id=16, version=0, encodedLength=0, offset=2, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            //Token{signal=ENCODING, name='Chairs', description='null', id=-1, version=0, encodedLength=2, offset=2, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='UTF-8', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
            builder.append("numChairs=");
            builder.append(numChairs());
            builder.append(')');
            return builder;
        }
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[Classroom](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (actingVersion != SCHEMA_VERSION)
        {
            builder.append(actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        //Token{signal=BEGIN_GROUP, name='students', description='null', id=2, version=0, encodedLength=16, offset=0, componentTokenCount=45, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("students=[");
        StudentsDecoder students = students();
        if (students.count() > 0)
        {
            while (students.hasNext())
            {
                students.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='desks', description='null', id=14, version=0, encodedLength=4, offset=-1, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("desks=[");
        DesksDecoder desks = desks();
        if (desks.count() > 0)
        {
            while (desks.hasNext())
            {
                desks.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}
