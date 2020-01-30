package Algorithms;

public class BinarSearch {

    public static void main(String args[]) {
        int[] integerArray = {1, 12,13, 15, 40, 234, 345, 800, 977};
        int elementToFind = 346;
        System.out.println("Element " + elementToFind + " found, index: " + binarySearch(integerArray, elementToFind, 0, integerArray.length - 1));
    }

    public static int binarySearch(int[] sortedIntegerArray, int elementToFind, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (elementToFind < sortedIntegerArray[mid]) {
            return binarySearch(sortedIntegerArray, elementToFind, low, mid - 1);
        } else if (elementToFind > sortedIntegerArray[mid]) {
            return binarySearch(sortedIntegerArray, elementToFind, mid + 1, high);
        } else {
            return mid;
        }
    }
}
