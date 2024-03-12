package Revision;

public class A {
    private int a;
    private final B b = new A.B();
    A() {a = 10;}
    void aprint() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        A a1 = new A();
        A.B ab = new A.B();
        A.B ab1 = new A.B();
        a1.aprint();
        ab.bprint();
//        A aaa = ab1.givebackouter();
//        System.out.println(aaa == a1);
    }
    static class B {
        private int b;
        private B abc = new B();
        public B() {
            this.b = 100;
        }
        void bprint() {
            System.out.println(b);
//            aprint();
        }

//        A givebackouter() {
////            return A.this;
//        }
    }
}
