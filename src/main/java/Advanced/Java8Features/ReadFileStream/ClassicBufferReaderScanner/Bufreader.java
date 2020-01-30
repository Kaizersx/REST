package Advanced.Java8Features.ReadFileStream.ClassicBufferReaderScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufreader {
    public static void main(String args[]) {

        String fileName = "C://Users/KaizerSX/IdeaProjects/Examples/src/Advanced/Java8Features/ReadFileStream/lines.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
