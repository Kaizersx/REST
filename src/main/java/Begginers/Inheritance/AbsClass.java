package Begginers.Inheritance;

public abstract class AbsClass implements InterFaceFlyCar, InterFace2 {


    int amountOfWheels=4;
    int getAmountOfDoors=4;

   static int x=5;

    public int getSum(int z,int y){

        return z+y;
    }


     protected int absMet(int x){
        return 5;
     };

}
