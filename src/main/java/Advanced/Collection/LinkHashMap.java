package Advanced.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {


    /**
     * Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order.
     * It inherits the HashMap class and implements the Map interface.
     * The important points about Java LinkedHashMap class are:
     * A LinkedHashMap contains values based on the key.
     * It contains only unique elements.
     * It may have one null key and multiple null values.
     * It is the same as HashMap instead maintains insertion order.
     * Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
     * Just like HashMap, LinkedHashMap is not thread-safe. You must explicitly synchronize concurrent access
     * to a LinkedHashMap in a multi-threaded environment.
     * */

    public static void main(String[] args) {

        LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();

        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Chris", "London");
        userCityMapping.put("David", "Paris");
        userCityMapping.put("Jesse", "California");
        userCityMapping.put("Dan","California");


        userCityMapping.forEach((user, city) -> {
            System.out.println(user + " => " + city);
        });

        System.out.println("\n");

//        Iterating over the entrySet of a LinkedHashMap using iterator()
        LinkedHashMap<String, String> userCityMappings = new LinkedHashMap<>();

        userCityMappings.put("Rajeev", "Bengaluru");
        userCityMappings.put("Chris", "London");
        userCityMappings.put("David", "Paris");
        userCityMappings.put("Jesse", "California");

        Iterator<Map.Entry<String, String>> userCityMappingIterator
                = userCityMappings.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<String, String> entry = userCityMappingIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
