package Advanced.Java8Features.ReadFileStream.ClassicBufferReaderScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

    public static void main(String args[]) {

        String fileName = "C://Users/KaizerSX/IdeaProjects/Examples/src/Advanced/Java8Features/ReadFileStream/lines.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
