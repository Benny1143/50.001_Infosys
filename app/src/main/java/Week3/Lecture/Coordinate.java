package Week3.Lecture;

import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString() {
        return String.format("%x %x",x,y);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(),getY());
    }

    public static void main(String [] args){
        Coordinate c1 = new Coordinate(1,3);
        Coordinate c2 = new Coordinate(1,3);
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1);
    }
}
