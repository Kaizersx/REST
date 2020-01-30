package Advanced.Lyambdas.StreamEx;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAndMapEx {

    /**
     * Before Java 8 :
     *
     * Map<Integer, String> map = new HashMap<>();
     map.put(1, "linode.com");
     map.put(2, "heroku.com");

     String result = "";
     for (Map.Entry<Integer, String> entry : map.entrySet()) {
     if("something".equals(entry.getValue())){
     result = entry.getValue();
     }
     } */


    public static void main(String[] args) {

        /** A full example to filter a Map by values and return a String.*/
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        // Before Java 8
        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);

        //Map -> Stream -> Filter -> String
        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + result);

        // filter more values
        result = HOSTING.entrySet().stream()
                .filter(x -> {
                    if (!x.getValue().contains("amazon") && !x.getValue().contains("digital")) {
                        return true;
                    }
                    return false;
                })
                .map(map -> map.getValue())
                .collect(Collectors.joining(","));

        System.out.println("With Java 8 : " + result);

    }

}
