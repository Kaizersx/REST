package Advanced.MultiThreads.WorkExample5;

public class Test {

    public static void main(String[] args) {

//        MyThread myThread= new MyThread();
//        MyThread myThread2= new MyThread();
//        /** Очень важно запускать именно метод  start() , а не run() ,
//         *  так как не будет никакой параллельности, а просто последовтаельно выполнится код*/
//        myThread.start();
//        myThread2.start();

        Thread thread= new Thread(new Runner());
        Thread thread2= new Thread(new Runner());
        thread.start();
        thread2.start();
        System.out.println("Hello FROM MAIN METHOD");
    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {

            System.out.println("Hello  from my friend!"+Thread.currentThread().getName());
        }
    }
}


class Runner implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+Thread.currentThread().getName());

        }
    }
}