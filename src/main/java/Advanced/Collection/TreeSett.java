package Advanced.Collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet cannot contain duplicate elements.
 * The elements in a TreeSet are sorted as per their natural ordering, or based on a custom Comparator that is supplied at the time of creation of the TreeSet.
 * TreeSet cannot contain a null value.
 * TreeSet internally uses a TreeMap to store elements.
 * The TreeSet class internally uses a TreeMap to store elements.
 * This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
 * TreeSet implementation is not synchronized - If multiple threads access a tree set concurrently,
 * and at least one of the threads modifies the set, it must be synchronized externally. Example:
 *    SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
 * The iterators returned by this class's iterator method are fail-fast: if the set is modified at
 * any time after the iterator is created, in any way except through the iterator's own remove method, the iterator will throw a ConcurrentModificationException.*/

public class TreeSett {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(49);


        numbers.forEach(num-> System.out.println(num));
// Remove an element from the TreeSet
        boolean isRemoved = numbers.remove(49);

        System.out.println("\n");
        numbers.forEach(num-> System.out.println(num));

        numbers.removeIf(num->num%2==0);

        System.out.println("\n");
        numbers.forEach(num-> System.out.println(num));


        //TreeSet with a custom Comparator Example(Descending order)

        SortedSet<String> weekDays = new TreeSet<>(Comparator.reverseOrder());
// Adding new elements to a TreeSet
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday ");
        weekDays.add("Friday ");
        weekDays.add("Saturday  ");
        weekDays.add("Sunday");

        System.out.println("weekDays Set : " + weekDays);



      // TreeSet with a custom comparator (Case Insensitive Order)
        //Let's create a TreeSet with a custom comparator that sorts the elements by ignoring the case.
// Creating a TreeSet with a custom Comparator (Case Insensitive Order)
        SortedSet<String> weekDayss = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
// Adding new elements to a TreeSet
        weekDayss.add("Monday");
        weekDayss.add("Tuesday");
        weekDayss.add("Wednesday");
        weekDayss.add("Thursday ");
        weekDayss.add("Friday ");
        weekDayss.add("Saturday  ");
        weekDayss.add("Sunday");

        System.out.println("weekDays Set : " + weekDayss);

// Now, lowercase elements will also be considered as duplicates
        weekDayss.add("sunday");
        System.out.println("After adding \"sunday\" : " + weekDayss);


    }
}
