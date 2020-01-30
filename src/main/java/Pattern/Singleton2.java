package Pattern;


/** +threadsafe
 * - no lazy init
 * -no parameters
 * - no try catch
 * */

public class Singleton2 {

    private Singleton2(){

        System.out.println("Singleton2 created");
    }

    private final static Singleton2 instance= new Singleton2();

    public static Singleton2 getInstance(){

        return  instance;
    }


}
