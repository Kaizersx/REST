package Advanced.MultiThreads.WorkExample2;

public class Threadss {

    public static void main(String[] args) {

        getStart();
    }



    public  static  void getStart(){
        StringBuffer stringBuffer= new StringBuffer();

        Runnable runnable= new Runnable() {
            @Override
            public void run() {

                System.out.println(stringBuffer.append("Hello my lovely world, this is my next one threads example")
                        .append(Thread.currentThread().getName())
                        .append("\n"));
            }
        };

        Thread thread= new Thread(runnable);
        Thread thread2= new Thread(runnable);
        Thread thread3= new Thread( runnable);
        Thread thread4= new Thread(runnable);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();




    }

}
