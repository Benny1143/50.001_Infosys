package Week3;

public class ClassDemo extends b {
    public static void main(String[] args) {
        System.out.println(new SubClass().a("tomato"));
    }
}
class SubClass extends ClassDemo {
    public String a(String b){
        return b;
    }
}
abstract class AbstractClass extends SubClass {
    protected abstract void tomato();
}
interface InterfaceClass {
    void b();
}

class MainClass extends AbstractClass implements InterfaceClass {
    protected void tomato() {

    }
    public void b() {

    }
}
class b {
    private int c (int a) {
        return 0;
    }
}
// abstract class b {
//    protected abstract int c (int a);
//    int d;
// }
// abstract class c extends b {
//    public abstract int c (int a);
// }
//
