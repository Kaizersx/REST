package Begginers;

import java.io.*;
public class IO {


    public static void main(String[] args) throws IOException {


        InputStreamReader inputStreamReader= new InputStreamReader(System.in);

        BufferedReader br= new BufferedReader(inputStreamReader);

        System.out.print("Pls enter your name: ");

        String  name= br.readLine();

        System.out.print("Pls enter your family name: ");

        String famname=br.readLine();



        double x= Double.parseDouble(famname);



    }
}
