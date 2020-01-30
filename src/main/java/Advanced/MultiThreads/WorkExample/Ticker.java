package Advanced.MultiThreads.WorkExample;

public class Ticker implements Runnable {

    private final  String name;

    Ticker(String name){

        this.name=name;
    }

    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {

            System.out.println(name+": "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
