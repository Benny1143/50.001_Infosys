package Problem_Set1A;
import java.util.Date;

public class HW2_2Triangle {
    public static void main(String[] args) {
        Triangle myTri = new Triangle();
        myTri.setColor("red");
        myTri.setFilled(true);
        System.out.println(myTri);
        System.out.println(myTri.isFilled());

        Triangle myTri2 = new Triangle(2.0, 4.0, 5.5);
        System.out.println(myTri2);
        System.out.println("area : " + myTri2.getArea() + " perimeter: " + myTri2.getPerimeter());

    }
}

class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    Triangle () {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double sp = (side1 + side2 + side3)/2;
        return Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
    }

    public double getPerimeter() { return side1+ side2 + side3;}
    @Override
    public String toString() {
        return String.format("Triangle: side1 = %g side2 = %g side3 = %g", side1,side2,side3);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class GeometricObject {
    public String color = "white";
    public boolean filled = false;
    public Date dateCreated = new Date();

    public GeometricObject() {
    }

    public GeometricObject(String var1, boolean var2) {
        this.color = var1;
        this.filled = var2;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String var1) {
        this.color = var1;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean var1) {
        this.filled = var1;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "color: " + this.color + "\\nfilled: " + this.filled;
    }
}

