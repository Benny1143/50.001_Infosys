package Revision;

public class Dog {
    interface Meal {
        void eat(String name);
    }
    private String name;
    Dog(String name){
        this.name = name;
    }
    void dinnerTime(Meal meal)  {
        meal.eat(name);
    }
}

class ChickenDinner implements Dog.Meal {

    @Override
    public void eat(String name) {

    }
}
class Tomato {
    void a() {
        Dog dog = new Dog("Fido");
        dog.dinnerTime(new ChickenDinner());
    }
}