package ProblemSet1B;

import java.util.ArrayList;

public class FilterPersonExample {
    // No need to modify this class
    public static void main(String[] args) {
        Person p1 = new Person("A", 90, 'F', false);
        Person p2 = new Person("B", 60, 'M', true);
        Person p3 = new Person("C", 30, 'F', true);
        Person[] p = {p1, p2, p3};

        System.out.println( Filter.seniorFilter(p) );
    }
}

class Filter {
    static ArrayList<String> seniorFilter(Person[] people) {
        ArrayList<String> names = new ArrayList<String>();
        for(Person p: people){
            if(p.getAge() >= 60) {
                names.add(p.getName());
            }
        }
        return names;
    }
}



class Person {
    private String name;
    private int age;
    private char gender;
    private boolean sharingConsent;

    public Person(String name, int age, char gender, boolean sharingConsent) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sharingConsent = sharingConsent;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return sharingConsent ? name: "Anonymous";
    }

    public boolean getSharingConsent() {
        return sharingConsent;
    }
}