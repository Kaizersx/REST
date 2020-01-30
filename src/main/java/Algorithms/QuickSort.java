//package Algorithms;
//
//import java.util.Arrays;
//
//public class QuickSort {
//
//
//    public static int[]arr={1,2,5,4};
//
//    public static void main(String[] args) {
//
//      doSort(0,arr.length-1);
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//
//
//    public static void doSort(int start,int end){
//
//        if(start>=end) return;
//        int i=start, j=end;
//
//        int cur=(i+j)/2;
//        while(i<j){
//            while (i<cur && (arr[i]<=arr[cur])){
//                i++;
//            }
//            while (i>cur && (arr[cur]<=arr[j])){
//                j--;
//            }
//
//            if(i<j){
//
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                if(i==cur) cur=j;
//                else if(j==cur)cur=i;
//            }
//        }
//
//        doSort(start,cur);
//        doSort(cur+1,end);
//    }
//
//}
