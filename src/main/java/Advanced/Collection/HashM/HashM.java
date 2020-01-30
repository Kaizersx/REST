package Advanced.Collection.HashM;

import java.util.*;

public class HashM {

    public static void main(String[] args) {


        /**HASHMAP- это ассоциативный массив. Структура данных, которая хранит пару ключ-значение
         *HASHMAP - это массив, который хранит ссылки на связанные списки, в которых хранятся наши объекты.
         * Каждому элементу массива соответствует один список.
         *
         *
         * */


        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

// Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four",null);
        numberMapping.put("One",1);

        System.out.println(numberMapping+"\n");
// Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);

        if(numberMapping.containsKey("Four")){
            System.out.println( "ДА ЧУВАК , ТАМ ЕСТЬ  ЦИФРА 4");
        }


        numberMapping.remove("Two",4);

        System.out.println("\n"+numberMapping);

        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);

        // iterate map using java 8 forEach method
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });


//        HashMap is not synchronized, which means you cannot use it on a multi-threaded Java program without external synchronization.
// In another word, if you share one instance of HashMap between multiple threads, each is either adding, removing or updating entries then
// it's possible that HashMap loss its structure and not behave as expected.
//        Use the Collections.synchronizedMap() method to obtain a synchronized view of the HashMap.
//        Write the increment logic inside a synchronized block.
//                We can use a ConcurrentHashMap for thread safety instead of the HashMap obtained via Collections.synchronizedMap() method.
// The ConcurrentHashMap provides thread-safe operations on the Map.
        Map<String, String> currencies = new HashMap<String, String>();
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("HongKong", "HKD");
        currencies.put("Australia", "AUD");

// Synchronizing HashMap in Java
        currencies = Collections.synchronizedMap(currencies);
// Make sure to synchronize Map while Iterating
// getting key set can be outside synchronized block
        Set<String> keySet = currencies.keySet();

        synchronized (currencies) {
            Iterator<String> itr = keySet.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }


    }



}
