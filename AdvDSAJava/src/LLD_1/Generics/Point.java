package LLD_1.Generics;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // complete the code here
        if(obj.hashCode() == this.hashCode())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        // complete the code here
        return Objects.hash();
    }
}