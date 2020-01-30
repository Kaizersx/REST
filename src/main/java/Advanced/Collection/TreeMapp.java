package Advanced.Collection;


/**
 * TreeMap in Java
 * The TreeMap in Java is used to implement Map interface and NavigableMap along with the Abstract Class.
 * The map is sorted according to the natural ordering of its keys,
 * or by a Comparator provided at map creation time, depending on which constructor is used.
 * This proves to be an efficient way of sorting and storing the key-value pairs.
 * The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators.
 * The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads,
 * concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.
 * Some important features of the treemap are:
 *
 *
 * This class is a member of Java Collections Framework.
 * The class implements Map interfaces including NavigableMap, SortedMap and extends AbstractMap
 * TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown. However, multiple null values can be associated with different keys.
 * All Map.Entry pairs returned by methods in this class and its views represent snapshots of mappings at the time they were produced. They do not support the Entry.setValue method.
 * */


public class TreeMapp {

    public static void main(String[] args) {
String a="abcffgfadgg";



        System.out.println(a);

        System.out.println(a.substring(4, 7));


    }
}
