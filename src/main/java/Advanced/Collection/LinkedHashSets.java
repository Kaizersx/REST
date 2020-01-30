package Advanced.Collection;

import java.util.LinkedHashSet;

/**
 *Java LinkedHashSet class is a Hash table and Linked list implementation of the Set interface.
 * Contains unique elements only like HashSet.
 * Provides all optional set operations, and permits null elements.
 * Maintains insertion order.  *****************************
 * LinkedHashSet is not synchronized - If multiple threads access
 * a linked hash set concurrently, and at least one of the threads modifies the set, it must be synchronized externally. Example:
 *
 */


public class LinkedHashSets {


    public static void main(String[] args) {
        // Creating a HashSet
        LinkedHashSet<String> daysOfWeek = new LinkedHashSet<>();

// Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

// Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
    }
}
