package Advanced.Lyambdas.StreamEx;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamReuse {

    public static void main(String[] args) {

        //Example with exception :Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//        String[] array = {"a", "b", "c", "d", "e"};
//        Stream<String> stream = Arrays.stream(array);
//
//        // loop a stream
//        stream.forEach(x -> System.out.println(x));
//
//        // reuse it to filter again! throws IllegalStateException
//        long count = stream.filter(x -> "b".equals(x)).count();
//        System.out.println(count);


        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new stream
        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another new stream
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);


    }
}
