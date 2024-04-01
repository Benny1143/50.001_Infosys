package Problem_Set3A;

public class TestAnimal {

    public static void main(String[] args) {

        Animal cat1 = new Cat("ichika");
        System.out.println(cat1.getName());
        System.out.println(cat1.makeSound());
        /** Output:
         * Cat:ichika
         * Cat:ichika says Meow */

        Animal cat2 = new Cat("nino");
        Animal cat3 = new Cat("ichika");
        System.out.println(cat1.equals(cat3));
        System.out.println(cat2.equals(cat3));
        /** Output:
         * true
         * false */

        Animal dog1 = new Dog("Fido");
        System.out.println(dog1.getName());
        System.out.println(dog1.makeSound());
        /** Output
         * Dog:Fido
         * Dog:Fido says Woof
         */
    }
}



abstract class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String makeSound();

    // override toString(), equals() and hashCode()

}

class Dog extends Animal {
    Dog(String name) {
        super("Dog: " + name);
    }
    @Override
    public String makeSound() {
        return "";
    }
}

class Cat extends Animal {
    Cat(String name) {
        super("Cat: " + name);
    }
    @Override
    public String makeSound() {
        return "";
    }
}

