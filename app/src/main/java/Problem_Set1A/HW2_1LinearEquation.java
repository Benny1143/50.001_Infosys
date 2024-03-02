package Problem_Set1A;

public class HW2_1LinearEquation {
    public static void main(String[] args) {
            LinearEquation a = new LinearEquation(2, 3,3,-2,17,6 );
        System.out.println(a.getX());
        System.out.println(a.getY());
    }
}
class LinearEquation {
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        return denominator() != 0;
    }

    private double denominator(){
        return a*d - b*c;
    }

    public double getX() {
        return (d*e-f*b)/denominator();
    }

    public double getY() {
        return (a*f-e*c)/denominator();
    }
}
