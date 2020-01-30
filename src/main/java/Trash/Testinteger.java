package Trash;

import java.util.Arrays;

public class Testinteger {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Arrays.stream(number).filter(x->x==2).forEach(System.out::println);
    }
}
