package Advanced.Collection;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {

        Stack<String>strings=new Stack<>();

        strings.push("A");
        strings.push("B");
        strings.push("C");


        Integer x=strings.search("C");

        if (x==-1){
            System.out.println("element not found");
        }
        else {
            System.out.println("Requaired element exist in follow postion: "+ x);
        }
    }
Object bject= new Object();


}
