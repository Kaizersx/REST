package Advanced.Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
 * The important points about Java HashSet class are:
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * Difference between List and Set
 * List can contain duplicate elements whereas Set contains unique elements only.
 * Set does not guarantee an insertion order. **********************************
 */


public class HashS {


    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}
