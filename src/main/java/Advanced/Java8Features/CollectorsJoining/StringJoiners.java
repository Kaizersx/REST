package Advanced.Java8Features.CollectorsJoining;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoiners {

    public static void main(String[] args) {


//        1.1 Join String by a delimiter

        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result = sj.toString(); //aaa,bbb,ccc

//       Copy 1.2 Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.

                StringJoiner sj2 = new StringJoiner("/", "prefix-", "-suffix");
        sj.add("2016");
        sj.add("02");
        sj.add("26");
        String result2 = sj2.toString(); //prefix-2016/02/26-suffix

//        StringJoiner is used internally by static String.join().
//
//        2.1 Join String by a delimiter.

                //2015-10-31
                String result3 = String.join("-", "2015", "10", "31" );

//        2.2 Join a List by a delimiter.

        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        //java, python, nodejs, ruby
        String result4 = String.join(", ", list);
    }
}
