package Advanced.Java8Features.CollectorsJoining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

    //java | python | nodejs | ruby
    String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));


    static void  test(){

        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result = list.stream().map(x -> x.getName())
                .collect(Collectors.joining("| ", "{", "}"));

        System.out.println(result);
    }

    public static void main(String[] args) {
        test();


    }
}
