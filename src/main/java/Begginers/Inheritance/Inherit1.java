package Begginers.Inheritance;

public class Inherit1 extends AbsClass {
    Main main;

    int x=3;


    public static void main(String[] args) {
        Inherit1 inherit1= new Inherit1();




    }

    @Override
    public void getFly() {
        System.out.println("My car getting fly!");
    }

    @Override
    public int absMet(int x) {
        return  5;
    }
}
