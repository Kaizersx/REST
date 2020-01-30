package Advanced.Lyambdas.StreamEx;

public class StringToChars {


    //simple way to convert String to CharsArray
    public static void main(String[] args) {

        String password = "password123";

        char[] passwordInCharArray = password.toCharArray();

        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }

    }

}
