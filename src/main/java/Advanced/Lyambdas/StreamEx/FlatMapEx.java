package Advanced.Lyambdas.StreamEx;


import java.util.Arrays;
import java.util.stream.Stream;

/**In Java 8, Stream can hold different data types, for examples:

 Stream<String[]>
 Stream<Set<String>>
 Stream<List<String>>
 Stream<List<Object>>
 Copy
 But, the Stream operations (filter, sum, distinct…) and collectors do not support it, so, we need flatMap() to do the following conversion :

 Stream<String[]>		-> flatMap ->	Stream<String>
 Stream<Set<String>>	-> flatMap ->	Stream<String>
 Stream<List<String>>	-> flatMap ->	Stream<String>
 Stream<List<Object>>	-> flatMap ->	Stream<Object> */

//1.1 The below example will print an empty result, because filter() has no idea how to filter a stream of String[].
//public class TestExample1 {
//
//    public static void main(String[] args) {
//
//        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
//
//        //Stream<String[]>
//        Stream<String[]> temp = Arrays.stream(data);
//
//        //filter a stream of string[], and return a string[]?
//        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));
//
//        stream.forEach(System.out::println);
//
//    }
//
//}



public class FlatMapEx {


    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/

    }
}
