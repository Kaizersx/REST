package Advanced.Collection;

import java.util.*;

public class LinkedL {


    public static void main(String[] args) {


        List<String>list= new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("g");



        for (String s:list
        ) {
            System.out.println(s);
        }

        ((LinkedList<String>) list).addLast("X");
        ((LinkedList<String>) list).addFirst("O");

        System.out.println("\n\n");

        for (String s:list
        ) {

            System.out.println(s);
        }

        List<String> secondList= new ArrayList<>();
        secondList.add("Jesse");
        secondList.add("Walt");
         list.addAll(secondList);
        System.out.println("After addAll(secondList) : " + list);



        list.removeIf(programmingLanguage -> programmingLanguage.startsWith("c"));

        System.out.println("\n"+ list);


        LinkedList<String> progLangs = new LinkedList<>();


        progLangs.add("Andre");
        progLangs.add("Boyl");
        progLangs.add("Dack");
        progLangs.add("Colean");
        progLangs.add("Eastwood");
        progLangs.add("Rachel");


        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
        progLangs.forEach(name -> {
                System.out.println(name);
        });




        System.out.println("\n=== Iterate over a LinkedList using iterator2() and Java 8 forEachRemaining() method ===");

        Iterator <String> iterator= progLangs.iterator();
        iterator.forEachRemaining(speciesName -> {
                System.out.println(speciesName);
        });


        System.out.println("\n=== Iterate over a LinkedList using iterator2() ===");
        Iterator < String > iterator2 = progLangs.iterator();
        while (iterator2.hasNext()) {
            String speciesName = iterator2.next();
            System.out.println(speciesName);
        }

        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
        Iterator < String > descendingIterator = progLangs.descendingIterator();
        while (descendingIterator.hasNext()) {
            String speciesName = descendingIterator.next();
            System.out.println(speciesName);
        }


        System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
        // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards
        ListIterator < String > listIterator = progLangs.listIterator(progLangs.size());
        while (listIterator.hasPrevious()) {
            String speciesName = listIterator.previous();
            System.out.println(speciesName);
        }


    }
}
