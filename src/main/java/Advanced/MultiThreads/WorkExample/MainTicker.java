package Advanced.MultiThreads.WorkExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTicker {

    public static void main(String[] args) {

        Ticker ticker= new Ticker("Ticker1");
        Ticker ticker2= new Ticker("Ticker2");


        ExecutorService executorService=  Executors.newFixedThreadPool(2);  //создание пула потоков с указанием числа потоков
        executorService.submit(ticker);
        executorService.submit(ticker2);
    }
}
