package Advanced.MultiThreads.WorkExample3;

public class MyThreadv2 {

    private static int counter;


    public static void main(String[] args) {
        test1();
    }

    public static void test1(){

        Runnable runnable= new Runnable() {


            @Override
              public void run() {

                /** вместо synchronized synchronized блок. Здесь появляется  объект this. В скобках указывается монитор синхронизации.
                 * Монитором синхронизации может выступать совершенно любой объект. Если synchronized пишется перед функцией(методом) являющейся методом какого-то объекта, то
                 * монитором является сам объект( в которой находится метод) Зачем нужен монитор синхронизации?
                 * Поток может зайти во внутрь synchronized блока только , если осуществить захват монитора синхронизации*/
                synchronized (this) {
                    counter = 0;
                    for (int i = 0; i < 5; i++) {
                        counter = counter + 1;
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                    }
                }
            }
        };

        Thread thread1= new Thread(runnable);
        Thread thread2= new Thread(runnable);

        thread1.start();
        thread2.start();

    }
}
