package Advanced.MultiThreads.MyExample;

public class Main {

    static int x=5;

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread= new MyThread();
        myThread.start();

        MyThreads2 myThreads2= new MyThreads2();
        myThreads2.start();

    }

}
