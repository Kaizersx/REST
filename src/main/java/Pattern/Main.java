package Pattern;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {

        Singleton2 singleton1=Singleton2.getInstance();
        Singleton2 singleton2= Singleton2.getInstance();

        out.println(singleton1);
        out.println(singleton2);


    }
}
