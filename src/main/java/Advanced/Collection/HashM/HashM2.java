package Advanced.Collection.HashM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashM2 {

    public static void main(String[] args) {

        Map<String,Integer>wordMap= new HashMap<>();

        System.out.println("Please enter text: ");

        Scanner scanner= new Scanner(System.in);

        String string=scanner.nextLine();

        String[]tokens=string.split(" ");

        for (String token:tokens
             ) {
            String word=token.toLowerCase();

            Integer count= wordMap.get(word);
            if(count==null){wordMap.put(word,1);}
            else {wordMap.put(word,count+1);}

        }

        wordMap.forEach((k,v)-> System.out.println("Key:"+k+" "+"value:"+v));
    }
}
