package Algorithms;

//Метод пузырьком имеет квадратичную сложность O(n^2). Эта сложность самая длинная, но при этом самая понятная.

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int  arrx[]={2,4,1,3,5};
        bubbleSortMethod(arrx);
    }

    public static void  bubbleSortMethod(int[]arr){

        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
