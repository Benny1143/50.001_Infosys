package Week1;

import androidx.annotation.NonNull;

public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s is %s years old",this.name,this.age);
    }
}
