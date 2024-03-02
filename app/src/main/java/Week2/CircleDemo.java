package Week2;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.radius);
        System.out.println(c.getArea());
        Circle a = new Circle();
        Circle d = new Circle();
        System.out.println(a.number);
    }
}

class Circle {
    double radius;
    String color;

    static int number;

    Circle () {
        this(1.5, "Grey");
    }
    Circle (double radius) {

        this(radius, "Grey");
    }
    Circle (String color) {

        this(1.5, color);
    }

    Circle(double radius,String color) {
        number += 1;
        this.radius = radius;
        this.color = color;
    }
    double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
}
