package Algorithms;

public class ShakerSort {

    static int mas[]={4,1,6,2,5,3,9,8};

    public static void main(String[] args) {

        int left=1,right=mas.length-1;
        do {
            for (int i = right; i >= left; i--) {

                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }
            }
            left++;

            for (int i = left; i <= right; i++) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }

            }
            right--;
        }
        while (left<=right);

        for (int i = 0; i < mas.length; i++) {

            System.out.println(mas[i]);
        }

    }

}
