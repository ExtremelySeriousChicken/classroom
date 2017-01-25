package classroom;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;

import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;

import baseline.*;

import sun.misc.Unsafe;
import uk.co.real_logic.sbe.ir.Ir;
import uk.co.real_logic.sbe.ir.IrEncoder;
import uk.co.real_logic.sbe.xml.IrGenerator;
import uk.co.real_logic.sbe.xml.MessageSchema;
import uk.co.real_logic.sbe.xml.ParserOptions;
import uk.co.real_logic.sbe.xml.XmlSchemaParser;

/**
 * Created by seriouschicken on 1/16/17.
 */
public class Main {

    public static int encode(ClassroomEncoder classroom,
                             UnsafeBuffer directBuffer,
                             int bufferOffset) {
        classroom.wrap(directBuffer, bufferOffset);

        //create the student
        char[] years = {17, 1, 3};
        int[] uuid = {1, 2, 3};
        ShirtSize[] shirtSizes = {ShirtSize.S, ShirtSize.M, ShirtSize.L};
        byte[] shirtColors = {0, 1, 2};
        int[] gpas = {3, 3, 4};
        char[] numAssignmentsTotal = {1, 2, 3};
        char[] numAssignmentsTurnedId = {10, 30, 20};
        char[] numAssignmentsLate = {0, 3, 2};
        char[] deskId = {1, 2, 3};
        String[] firstNames = {"Jaake\0", "Edward\0", "Hana\0"};
        String[] lastNames = {"AAA", "BBB", "CCC"};

        ClassroomEncoder.StudentsEncoder students = classroom.studentsCount(3);

        for (int i = 0; i < 3; i++) {
            students.next()
                    .year(years[i])
                    .uuid(uuid[i])
                    .shirtSize(shirtSizes[i])
                    .shirtColor(shirtColors[i])
                    .gpa(gpas[i])
                    .numTotal(numAssignmentsTotal[i])
                    .numTurnedIn(numAssignmentsTurnedId[i])
                    .numLate(numAssignmentsLate[i])
                    .desk(deskId[i])
                    .firstName(firstNames[i]);
        }


        char [] SAs = {1,2,3,4};
        char [] numChairs = {4,5,6,7};

        ClassroomEncoder.DesksEncoder desks = classroom.desksCount(4);

        for(int  i = 0; i < 4; i++){
            desks.next()
                    .surfaceArea(SAs[i])
                    .numChairs(numChairs[i]);
        }

        return classroom.encodedLength();
    }

    public static void decode(
            ClassroomDecoder classroom,
            UnsafeBuffer     directBuffer,
            int              bufferOffset,
            int              blockLength,
            int              schemaId,
            int              actingVersion
    ){
        StringBuilder sb = new StringBuilder();

        classroom.wrap(directBuffer, bufferOffset, blockLength, actingVersion);

        System.out.println("printing out the students");
        System.out.println("size: " + classroom.students().count());
        int size = classroom.students().count();
        for(int i = 0; i < size; i++){
            byte[] buffer = new byte[128];
            ClassroomDecoder.StudentsDecoder sd = classroom.students().next();
            UnsafeBuffer tempBuffer = new UnsafeBuffer(buffer);

            int bufferLength = sd.getFirstName(tempBuffer, 0, tempBuffer.capacity());
            System.out.println("length: " + bufferLength);
            String s = new String(buffer, 0, bufferLength);

            System.out.println(s);
        }

        System.out.println("printing the output of the desk");
/**
        while(classroom.desks().hasNext()){
            ClassroomDecoder.DesksDecoder sd = classroom.desks().next();
            String output = sd.surfaceArea() + " " + sd.numChairs();
            System.out.println(output);
        }*/
    }



    public static void main(String[] args){

        //the decoder and encorder
        MessageHeaderDecoder MESSAGE_HEADER_DECODER = new MessageHeaderDecoder();
        MessageHeaderEncoder MESSAGE_HEADER_ENCODER = new MessageHeaderEncoder();
        ClassroomEncoder     CLASSROOM_ENCODER      = new ClassroomEncoder();
        ClassroomDecoder     CLASSROOM_DECODER      = new ClassroomDecoder();

        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        UnsafeBuffer directBuffer = new UnsafeBuffer(byteBuffer);

        int bufferOffset       = 0;
        int encodingLength     = 0;

        //setting up the encoder
        MESSAGE_HEADER_ENCODER.wrap(directBuffer, bufferOffset)
                              .blockLength(CLASSROOM_ENCODER.sbeBlockLength())
                              .templateId(CLASSROOM_ENCODER.sbeTemplateId())
                              .schemaId(CLASSROOM_ENCODER.sbeSchemaId())
                              .version(CLASSROOM_ENCODER.sbeSchemaVersion());

        bufferOffset += MESSAGE_HEADER_ENCODER.encodedLength();
        encodingLength = MESSAGE_HEADER_ENCODER.encodedLength();
        encodingLength += encode(CLASSROOM_ENCODER, directBuffer, bufferOffset);

        System.out.println("encoded data: ");
        for(int i = 0; i < encodingLength; i++){
            System.out.print((int) byteBuffer.getChar(i));
        }

        System.out.println();

        int decodedBufferOffest = 0;

        MESSAGE_HEADER_DECODER.wrap(directBuffer, decodedBufferOffest);

        int templateID    = MESSAGE_HEADER_DECODER.templateId();
        int blockLength   = MESSAGE_HEADER_DECODER.blockLength();
        int schemaId      = MESSAGE_HEADER_DECODER.schemaId();
        int actingVersion = MESSAGE_HEADER_DECODER.version();

        decodedBufferOffest += MESSAGE_HEADER_DECODER.encodedLength();

        decode(CLASSROOM_DECODER, directBuffer, decodedBufferOffest, blockLength, schemaId, actingVersion);
    }
}
