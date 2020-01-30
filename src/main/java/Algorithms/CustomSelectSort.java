package Algorithms;

import java.util.Arrays;

public class CustomSelectSort {

    public static int[] arr={2,5,1,6,4,7,3};


    public static void main(String[] args) {

        int min;

        for (int out = 0; out <arr.length-1 ; out++) {

            min=out;

            for (int in = out+1; in <arr.length ; in++) {

                if (arr[in]<arr[min]){

                    min=in;

                }

                int temp=arr[out];
                arr[out]=arr[min];
                arr[min]=temp;


            }

        }


        System.out.println(Arrays.toString(arr));

    }



}
