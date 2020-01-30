package Begginers.Inheritance;

import java.util.HashMap;
import java.util.Map;

public class Main  extends AbsClass{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    Testcls testcls= new Testcls();

    public  int  y=5;

    @Override
    public void getFly() {

    }


    void setTestcls(int x){

        int z=y;
        Testcls testcls2= new Testcls();

        testcls=testcls2;

        testcls.x=x;
    }



    static void getA(){
        System.out.println("get A");
    }

    static  int getA(int x){
        return 3;
    }

    static int getA(int y,int x){return  4;}

     String getA(int x,int y,int z){return "d";}

    public static void main(String[] args) {

        Main main= new Main();

        System.out.println(main.testcls.x);

        main.setTestcls(10);

        System.out.println(main.testcls.x);


        Map<String,String> map= new HashMap<>();
        map.put("A","AAA");
        map.put("B","BBB");


        map.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
