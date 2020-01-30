package Algorithms;

import java.util.Arrays;


/**Average complexity (СЛОЖНОСТЬ: n*log(n)^2 or n^(3/2)  */

public class ShellSort {

    static int mas[] = {2, 4, 1, 8, 2, 5, 9, 3};

    public static void main(String[] args) {


        ShellAlg(mas);

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }


    public static void ShellAlg(int[] mass) {

    int d=mass.length/2;

    while (d>0) {
        for (int i = 0; i < mass.length - d; i++) {

            int j = i;

            while ((j >= 0) && (mass[j] > mass[j + d])) {
                int temp = mass[j];
                mass[j] = mass[j + d];
                mass[j + d] = temp;
                j--;
            }

        }
        d=d/2;
    }

    }

}
