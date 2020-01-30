package Trash;

public class TestBook {





    public static void main(String[] args) {

        Book book= new Book();

        Book2 book2= new Book2();

        SimpleQueue simpleQueue = new SimpleQueue();

        simpleQueue.add(book);
        simpleQueue.add(book2);


        System.out.println(simpleQueue.remove());


    }
}
