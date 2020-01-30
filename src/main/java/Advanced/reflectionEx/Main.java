package Advanced.reflectionEx;

import java.lang.reflect.Method;

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class<A> cl = A.class;
        A inst= cl.newInstance();

        inst.foo();





    }
}
