package Algorithms;

public class SearchMaxArrValue {

    static double a[]={123,233,12,44,16};

    public static void main(String[] args) {
        double max = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        System.out.println(max);
    }


}
