package Problem_Set1A;

public class HW1_2MyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D a = new MyRectangle2D(0,0,4,4);
//        MyRectangle2D b = new MyRectangle2D(1,1,1, 1);
        System.out.println(a.contains(1,1));
//        System.out.println(a.overlaps(b));
    }
}
class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    MyRectangle2D() {
        this(0,0,1,1);
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return width*2 + height*2;
    }

    public boolean contains(double x, double y) {
        double xWidth = width/2;
        double yWidth = height/2;
        return (x >= this.x - xWidth && x <= this.x + xWidth) && (y <= this.y + yWidth && y >= this.y - yWidth);
    }
    public boolean contains(Cord xy) {
        return contains(xy.x, xy.y);
    }
    public boolean contains(MyRectangle2D r) {
        return contains(r.topLeft()) && contains(r.topRight()) && contains(r.bottomLeft()) && contains(r.bottomRight());
    }
    public boolean overlaps(MyRectangle2D r) {
        return contains(r.topLeft()) || contains(r.topRight()) || contains(r.bottomLeft()) || contains(r.bottomRight());
    }

    public Cord topLeft() {
        return new Cord(x - width/2, y + height/2);
    }
    public Cord topRight() {
        return new Cord(x + width/2, y + height/2);
    }
    public Cord bottomLeft() {
        return new Cord(x - width/2, y - height/2);
    }
    public Cord bottomRight() {
        return new Cord(x + width/2, y - height/2);
    }
}

class Cord {
    public double x;
    public double y;
    Cord(double x, double y){
        this.x = x;
                this.y = y;
    }
}
