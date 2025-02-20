package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\NMS\\OneDrive\\Desktop\\Advance Java\\Advance-Java\\IOStreams\\ByteStreamReader.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\NMS\\OneDrive\\Desktop\\Advance Java\\Advance-Java\\IOStreams\\ByteStreamWriter.txt");

            /**
             * read a byte at a time
             * if it reached end of the file, returns -1
             * */

            int content;

            while((content = fileInputStream.read()) != -1) {
                fileOutputStream.write((byte) content);
            }

        } catch (Exception e) {
            throw  e;
        } finally {
            /**
             * it is necessary to close both input and output streams otherwise it may keep open while java is running
             * */

            if(fileInputStream != null) {
                fileInputStream.close();
            }

            if(fileOutputStream != null ) {
                fileOutputStream.close();
            }
        }

    }

}
