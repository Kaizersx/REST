package Algorithms;

public class MergeSort {

    public static void main(String[] args) {


    }


    public static void mergesort(int[]src1,int src1start,int[]src2,int src2start,int []dest,int destStart,int size ){


        int index1=src1start;
        int index2=src2start;

        int src1End= Math.min(src1start+size,src1.length);
        int src2End= Math.min(src2start+size,src2.length);

        int IterationCount=src1End -src1start +src2End - src2start;

        for (int i = destStart; i <destStart+IterationCount ; i++) {

            if (index1<src1End &&(index2>=src2End || src1[index1]<src2[index2])){
                dest[i]=src1[index1];
                index1++;
            }
            else {
                dest[i]=src2[index2];
                index2++;
            }
        }


    }
}
