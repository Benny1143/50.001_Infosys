package Problem_Set3A;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestAnimal {
    public static void main(String[] args) {
        TestAnimal ta = new TestAnimal();
        Animal cat1 = ta.new Cat("ichika");
        System.out.println(cat1.getName());
        System.out.println(cat1.makeSound());
        /** Output:
         * Cat:ichika
         * Cat:ichika says Meow */

        Animal cat2 = ta.new Cat("nino");
        Animal cat3 = ta.new Cat("ichika");
        System.out.println(cat1.equals(cat3));
        System.out.println(cat2.equals(cat3));
        /** Output:
         * true
         * false */

        Animal dog1 = ta.new Dog("Fido");
        System.out.println(dog1.getName());
        System.out.println(dog1.makeSound());
        /** Output
         * Dog:Fido
         * Dog:Fido says Woof
         */
    }
    public class Cat extends Animal{

        public Cat(String name) {
            super("Cat:" + name);
        }

        @Override
        public String makeSound() {
            return getName() + " says Meow";
        }
    }
    public class Cow extends Animal{

        public Cow(String name) {
            super("Cow:" + name);
        }

        @Override
        public String makeSound() {
            return getName() + " says Moo Moo";
        }
    }
    public class Dog extends Animal{

        public Dog(String name) {
            super("Dog:" + name);
        }

        @Override
        public String makeSound() {
            return getName() + " says Woof";
        }
    }
    public abstract class Animal {

        private String name;

        Animal(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public abstract String makeSound();

        // override toString(), equals() and hashCode()
        @Override
        public String toString() {
            return getName();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public interface AnimalFactory {
        Animal createAnimal( String type, String name);
    }

    public class FarmFactory implements AnimalFactory{
        public Animal createAnimal(String type, String name){
            switch(type) {
                case "Cat": return new Cat(name);
                case "Dog": return new Dog(name);
                case "Cow": return new Cow(name);
                default: {
                    return null;
                }
            }
        }
    }
    public class Zoo {

        private AnimalFactory animalFactory;
        private List<Animal> animalList;

        Zoo(AnimalFactory animalFactory){
            this.animalFactory = animalFactory;
            animalList = new ArrayList<>();
        }

        public void addAnimal(String type, String name){
            Animal a = animalFactory.createAnimal(type, name);
            if(a != null) animalList.add(a);
        }

        public String performConcert(){
            String str = "";
            for(Animal a: animalList) {
                str += a.makeSound() + "*";
            }
            return str;
        }

        @Override
        public String toString() {
            return animalList.toString();
        }
    }

}
