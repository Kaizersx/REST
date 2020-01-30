package Algorithms;

public class AverageOfArray {


    public static void main(String[] args) {
        double a[]={1,2,3,4,5,6};
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++)
        {sum += a[i];}
        double average = sum / N;

        System.out.println(average);
    }
}
