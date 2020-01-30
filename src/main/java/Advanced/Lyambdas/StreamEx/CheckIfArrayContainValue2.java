package Advanced.Lyambdas.StreamEx;

import java.util.Arrays;
import java.util.List;

public class CheckIfArrayContainValue2 {


    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "C","G"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        // A or B
        if (list.contains("A") || list.contains("B")) {
            System.out.println("Hello A or B");
        }

        // A and B
        if (list.containsAll(Arrays.asList("A", "G"))) {
            System.out.println("Hello A and G");
        }

        // A and C
        if (list.containsAll(Arrays.asList("A", "C"))) {
            System.out.println("Hello A and C");
        }

    }
}
