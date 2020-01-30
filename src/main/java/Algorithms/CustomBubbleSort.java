package Algorithms;

import java.util.Arrays;

public class CustomBubbleSort {

    public static void main(String[] args) {

        int []x={4,8,2,5,1,3,9,7,6,10};

        for (int i = x.length-1; i >1 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }


        System.out.println(Arrays.toString(x));

    }


}
