package Algorithms;

public class AL1 {


    //линейный поиск

    public static void main(String args[]) {
        int[] integerArray = {800, 345, 977, 40, 12, -183, 234, 15};
        int elementToFind = 234;
        System.out.println("Element " + elementToFind + " found, index: " + linerSearch(integerArray, elementToFind));
    }

    public static int linerSearch(int[] integerArray, int key) {
        int arraySize = integerArray.length;
        for (int i = 0; i < arraySize; i++) {
            if (integerArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
