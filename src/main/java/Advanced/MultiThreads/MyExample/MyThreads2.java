package Advanced.MultiThreads.MyExample;

public class MyThreads2 extends Thread {


    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {
            System.out.println(Main.x+2);
        }

    }
}
