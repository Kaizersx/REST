package Advanced.Lyambdas.StreamEx.Arrayss;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class JoinArray {

    /**The simplest way is add the Apache Commons Lang library, and use ArrayUtils. addAll to join arrays.
     * This method supports both primitive and object type arrays. */

    public static void main(String[] args) {

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};

        String[] result = ArrayUtils.addAll(s1, s2);

        System.out.println(Arrays.toString(result));

        int [] int1 = new int[]{1,2,3};
        int[] int2 = new int[]{4,5,6};

        int[] result2 = ArrayUtils.addAll(int1, int2);

        System.out.println(Arrays.toString(result2));

    }

}