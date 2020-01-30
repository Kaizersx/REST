package Advanced.Lyambdas.StreamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapwithDuplicates {



    public static void main(String[] args) {

        /**Run below code, and duplicated key errors will be thrown! */

        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

        list.add(new Hosting(6, "linode.com", 100000)); // new line
//
//        // key = name, value - websites , but the key 'linode' is duplicated!?
//        Map<String, Long> result1 = list.stream().collect(
//                Collectors.toMap(Hosting::getName, Hosting::getWebsites));
//
//        System.out.println("Result 1 : " + result1);


        /**To solve the duplicated key issue above, pass in the third mergeFunction argument like this :
         *
         *
         * (oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
         * */




        Map<String, Long> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getName, Hosting::getWebsites,
                        (oldValue, newValue) -> oldValue
                )
        );

        System.out.println("Result 1 : " + result1);
    }
}
