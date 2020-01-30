package Advanced.GC;

import java.util.Objects;

public class GarbageColl {


    int x=5;

    int y=10;

    public static void main(String[] args) {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GarbageColl that = (GarbageColl) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}



