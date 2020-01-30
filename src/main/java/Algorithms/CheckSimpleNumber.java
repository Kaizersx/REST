package Algorithms;



public class CheckSimpleNumber {


    public static void main(String[] args) {


        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int N) {


        if (N < 2) return false;

        for (int i = 2; i*i <= N; i++)

            if (N % i == 0) return false;

            return true;
    }
}
