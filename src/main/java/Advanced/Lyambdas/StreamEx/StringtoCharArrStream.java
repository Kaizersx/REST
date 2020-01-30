package Advanced.Lyambdas.StreamEx;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StringtoCharArrStream {

    /** For Java 8, you can uses .chars() to get the IntStream, and convert it to Stream Char via .mapToObj*/


    public static void main(String[] args) {

        String password = "password123";

        password.chars() //IntStream
                .mapToObj(x -> (char) x)//Stream<Character>
                .forEach(System.out::println);

    }

}
