package Week3.Lecture;

public class TestA {
    public static void main(String[] args) {
        A a = new B();
        a.something();
    }
}

class A {
    public void something(){
        System.out.println("Anya in A");
    }
}

class B extends A  {
    @Override
    public void something() {
        System.out.println("Bond in B");
    }
    public void nothing() {
        System.out.println("Nothing here");
    }
}
