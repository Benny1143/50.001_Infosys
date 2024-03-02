package Example54;

import Week5.Lecture.Example54.ChickenFly;

public class TestBird {
    public static void main(String[] args) {
        Example54.Bird birdy = new Example54.Bird();
        birdy.setFlyBehaviour(new Example54.CanFly());
        birdy.fly();

        Example54.Bird chicken1 = new Example54.Bird();
        chicken1.setFlyBehaviour(new ChickenFly());
        chicken1.fly();
    }
}
