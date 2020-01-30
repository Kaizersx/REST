package Algorithms;

public class CopyArrtoAnotherArr {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int N = a.length;
        int[] b = new int[N];
        for (int i = 0; i < N; i++)
        {b[i]=a[i];}

        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]);
        }
    }
}
