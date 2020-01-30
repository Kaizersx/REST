package Advanced.MultiThreads.WorkExample3;

public class Mythread3 {


    private static int counter;


    public static void main(String[] args) {
        test1();
    }

    public static void test1(){

        Runnable runnable= new Runnable() {

            /**synchronized перед методом означает, что этот метод может выполняться  только в одном потоке одновременно.На время пока
             первый поток выполняет метод, второй поток остается заблокированным и ожидает пока первый поток не закончит работу внутри метода.*/
            @Override
            synchronized   public void run() {

                counter=0;
                for (int i = 0; i <5 ; i++) {
                     counter=counter+1;
                    System.out.println(Thread.currentThread().getName()+ ": "+counter);
                }

            }
        };

        Thread thread1= new Thread(runnable);
        Thread thread2= new Thread(runnable);

        thread1.start();
        thread2.start();

    }
}
