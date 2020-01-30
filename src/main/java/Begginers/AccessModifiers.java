package Begginers;

public class AccessModifiers {



    /**
     *
     * 1. Private Access Modifier
     * A private class member cannot be accessed from outside the class; only members of the same class can access these private members.
     * A class cannot be a private except inner classes because inner classes are nothing but again members of outer class. So members of a class (field, method, constructor and inner class) can be private but not the class itself.
     * We can’t create subclasses to that class which has only private constructors.
     *
     *
     *
     * 2. Default Access Modifier (no access modifier specified)
     * When we do not mention any access modifier, it is called default access modifier.
     * The scope of this modifier is limited to the package only. This means that if we have a class with the default access modifier in a package,
     * only those classes that are in this package can access this class.
     * No other class outside this package can access this class.
     * Similarly, if we have a default method or data member in a class, it would not be visible in the class of another package.
     *
     *
     * 3. Protected Access Modifier
     * If a class or its members are declared as protected are only accessible by the classes
     * of the same package and the subclasses present in any package.
     * You can also say that the protected access modifier is similar to
     * default access modifier with one exception that it has visibility in subclasses.
     * Classes cannot be declared protected. This access modifier is generally used in a parent-child relationship.
     *
     * */
    public int a=1;
    int b=2;
    protected int c= 3;

    public static void main(String[] args) {


        System.out.println();

    }


    class AM2 {

        public  void main(String[] args) {


            System.out.println(b);
        }
    }



}
