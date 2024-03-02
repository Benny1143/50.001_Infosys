package Week4;

public class Bird implements InterfaceBird {
    boolean canFly;
    boolean canSwim;

    Bird () {
        canFly = true;
        canSwim = false;
    }

    public static void main(String[] args) {
        Bird a = new Bird();
        a.fly();
        DomesticDuck b = new DomesticDuck();
        b.fly();
    }
    public void fly() {
        System.out.println(canFly ? "I CAN FLY" : "I can't fly");
    }

    public void swim() {
        System.out.println(canSwim ? "I CAN SWIM": "I can't swim");
    }
}

class DomesticDuck extends Bird {
    DomesticDuck () {
        this.canFly = false;
        this.canSwim = true;
    }
}
 interface InterfaceBird {
    void fly();
    void swim();
}