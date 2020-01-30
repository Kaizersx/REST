package Advanced.MultiThreads.WorkExample4;

import java.util.ArrayList;

public class Main {


    /** Очень часто при разработке приложения приходится выполнять код в отдельном потоке.
     *  В этом примере создадим код, который ожидает задачи на выполнение. В этот момент он находится в спящем состоянии
     *  и не потребляет ресурсы.Когда просыпается он выполняет их и снова засыпает, не нужно каждый раз его пересоздавать.
     *  Такие потоки называют WorkerThread*/

    public static void main(String[] args) {


        BlockingQueue queue= new BlockingQueue();

        Thread worker= new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                    Runnable task=queue.get();
                    task.run();
                }
            }
        });

        worker.start();

        for (int i = 0; i <10 ; i++) {

            queue.put(getTask());
        }

    }


    /** это простая задача, которая имитирует какую-то деятельность и выполняется
     * всего 1 секунду сообщив нам о времени своего начала и конца */
    public static Runnable getTask(){


        return new Runnable(){

            @Override
             public void run(){

                System.out.println("Task started: "+this);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){

                    e.printStackTrace();
                }
                System.out.println("Task finished: "+this);

                }
            };

        }

        /** Для того, чтобы реализовать WorkingThread нам понадобится блокирующая очередь.
         *  В блокирующей очереди нужно создать контейнер, который
         * содержит задачи ожидающие выполнения*/
        static class BlockingQueue{


            ArrayList<Runnable>tasks= new ArrayList<>();

            /**Основное назначение метода get - это взять основную задачу из очереди и вернуть.
             * Но если очередь пустая, то вызывающий поток блокируется методом wait()
             *
             * Метод get он synchronised , соответственно в него может зайти только один поток.Перед тем
             * как зайти в метод, поток должен захватить монитор. В качестве монитора выступает
             * текущий экземпляр блокирующей очереди (т.е. класс BlockingQueue
             * После того как поток захватит монитор и попадет внутрь метода get..далее, если список задач пуст, то
             * поток выполняет метод wait(). Метод wait освобождает мснитор многопоточности и таким образом поток больше
             * не имеет доступа к методу (т.к. монитор больше не захвачен) пока на том же самом мониторе где-то не будет вызван метод notify()*/

            public synchronized Runnable get(){

                while (tasks.isEmpty()){
                    try {
                        wait();
                    }

                    catch (InterruptedException e){e.printStackTrace();
                    }
                }
                Runnable task=tasks.get(0);
                tasks.remove(task);
                return task;
            }

            /** Метод put будет добавлять задачи в очередь и вызывает метод notify(). В момент , когда вызывается notify()
             * поток заблокированный в методе get() ( в том месте где прописан wait()) будет разлочен.
             * И поток может получить монитор обратно и продолжить выполнение кода */

            public  synchronized void put(Runnable task){

                tasks.add(task);
                notify();
            }
        }

    }

