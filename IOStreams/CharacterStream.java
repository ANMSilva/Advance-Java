package IOStreams;

import java.io.*;

public class CharacterStream {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {

            fileReader = new FileReader("C:\\Users\\NMS\\OneDrive\\Desktop\\Advance Java\\Advance-Java\\IOStreams\\CharacterStreamReader.txt");
            fileWriter = new FileWriter("C:\\Users\\NMS\\OneDrive\\Desktop\\Advance Java\\Advance-Java\\IOStreams\\CharacterStreamWriter.txt");

            /**
             * Reading and writing will be done character by character
             * */

            int content;
            while ((content = fileReader.read()) != -1) {
                fileWriter.write((char) content);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }

            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

}
