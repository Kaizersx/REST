package Advanced.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArraysL {

    static int x=0;

    public static void main(String[] args) {


//          List<Integer>mylist=getRandomList();
//
//          mylist.forEach(v-> System.out.print(v+","));


        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("b");

        list.stream().filter((v)->v=="b").forEach(v-> x++);
        System.out.println(x);

    }

    public static  List <Integer> getRandomList(){

        Random random= new Random();

        List<Integer> newlist= new ArrayList<>();

        int temp=10;

        while (temp>0){

            newlist.add(random.nextInt(100));
            temp--;
        }

    return newlist;
    }

}
