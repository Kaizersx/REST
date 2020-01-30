package Algorithms;

public class ArrayElementChangePosition {


    public static void main(String[] args) {
        int a[]={1,2,3,4,5};


        int N = a.length; // N=5;
        for (int i = 0; i < N/2; i++) {
            int temp = a[i]; // temp=1 ....temp=1
            a[i] = a[N-1-i] ; // a[i]= a[5-1-0]=> a[0]=>5  .... a[1]=>4..a[2]=>3...a[1]=>2
            a[N-i-1] = temp; // a[4]=1


        }

        for (int i = 0; i <a.length ; i++) {

            System.out.print(a[i]);
        }
    }
}
