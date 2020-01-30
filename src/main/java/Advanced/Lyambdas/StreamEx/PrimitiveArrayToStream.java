package Advanced.Lyambdas.StreamEx;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveArrayToStream {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};

        // 1. Arrays.stream -> IntStream
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        // 2. Stream.of -> Stream<int[]>
        Stream<int[]> temp = Stream.of(intArray);

        // Cant print Stream<int[]> directly, convert / flat it to IntStream
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));

    }

    //Which one?
    //For object arrays, both are calling the same Arrays.stream (refer example 1, JDK source code).
    // For primitive arrays, I prefer Arrays.stream as well,
    // because it returns fixed size IntStream directly, easier to manipulate it.

}
