package ProblemSet1B;

public class TestSound {
    // You are not required to modify this class
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new SiberianCat()};
        System.out.println((new Dog()).makeSound());
        System.out.println(AnimalConcert.performConcert(animals));
    }
}

class Animal {
    public String makeSound() {
        return "I am just an animal";
    }
}

class Dog extends Animal {

    public String makeSound() {
        return "Woof";
    }
}

class Cat extends Animal {
    public String makeSound() {
        return "Meow";
    }
}

class Cow extends Animal {
    public String makeSound() {
        return "Moo";
    }
}

class SiberianCat extends Cat {

}

class AnimalConcert {
    static String performConcert(Animal[] animals) {
        String[] sounds = new String[animals.length];
        for (int i =0; i < animals.length; i ++) {
            sounds[i] = animals[i].makeSound();
        }
        return String.join(", ", sounds);
    }
}