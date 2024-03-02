package Problem_Set2A;

public class Octagon implements Comparable<Octagon> {
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Octagon o) {
        return side > o.side ? 1 : -1;
    }
}
