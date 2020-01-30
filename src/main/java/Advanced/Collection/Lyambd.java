package Advanced.Collection;

public class Lyambd {

    public static void main(String[] args) {

        xPlusy plus= (x,y)->x+y;

        int x=plus.getPlus(5,10);

        System.out.println(x);

    }


   public interface xPlusy{

        int getPlus(int x, int y);

    }
}
