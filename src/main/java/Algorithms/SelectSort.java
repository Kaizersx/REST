package Algorithms;

import java.util.Arrays;

public class SelectSort {
    public static int arr[]={1,3,2,5,4,8,6,7,9};

    public static void main(String[] args) {

        int in,out,min;

        for (out = 0; out< arr.length-1 ; out++) {
            min=out;

            for (in = out+1; in <arr.length ; in++)

                if(arr[in]<arr[min])
                { min=in; }
            swap(out,min);
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void swap(int one, int two)
    {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
