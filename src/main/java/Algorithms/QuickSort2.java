package Algorithms;

public class QuickSort2 {

    public static void main(String[] args) {
        int mas[]= {4,1,6,3,2,8};

        mas=quickSort(mas,0,mas.length-1);

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }


    public  static int [] quickSort(int[]mas,int start,int end){
        if(start>=end) return  mas;

        int i=start;
        int j=end;

        int op=i-(i-j)/2;

        while(i<j){

            while((i<op) && (mas[i]<=mas[op]))i++;
            while((j>op) && (mas[j]>=mas[op]))j--;

            if (i<j){
                int temp=mas[i];
                mas[i]=mas[j];
                mas[j]=temp;
                if(i==op)op=j;
                else if(j==op)op=i;
            }
        }

        quickSort(mas,start,op);
        quickSort(mas,op+1,end);

        return mas;


    }


}
