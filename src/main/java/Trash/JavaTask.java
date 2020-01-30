package Trash;

public class JavaTask {

    public static void main(String[] args) {

        String []text=new String[]{"i","love","programming","test"};


        int i=0;
        String res="";
        while (text.length>i){

            res+=text[i]+" ";
            i++;
        }

        System.out.println(res);
    }
}
