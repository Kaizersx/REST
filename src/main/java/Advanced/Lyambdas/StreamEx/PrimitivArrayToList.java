package Advanced.Lyambdas.StreamEx;

import java.util.ArrayList;

import java.util.List;

public class PrimitivArrayToList {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = convertIntArrayToList(number);
        System.out.println("list : " + list);

    }

    private static List<Integer> convertIntArrayToList(int[] input) {

        List<Integer> list = new ArrayList<>();
        for (int i : input) {
            list.add(i);
        }
        return list;

    }
}
