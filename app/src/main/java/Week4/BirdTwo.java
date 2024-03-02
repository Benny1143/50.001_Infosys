package Week4;

public abstract class BirdTwo {
    public static void main(String[] args) {
        Chicken c = new Chicken();
        c.fly();
    }
    private FlyBehaviour flyBehaviour;
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void fly() {
        if(flyBehaviour !=null) {
            flyBehaviour.fly();
        }
    }
}
class Chicken extends BirdTwo {
    Chicken() {
        super.setFlyBehaviour(new CanFly());
    }
}

class Tomato extends BirdTwo {
    Tomato() {
        super.setFlyBehaviour(new CannotFly());
    }
}

class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

interface FlyBehaviour {
    void fly();
}

class CanFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I CAN FLY");
    }
}