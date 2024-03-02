package Week1;

public class Generic {
    public static void main(String[] args) {
       Container<Integer> a = new Container();
//     a.tomato = "asd";
       a.a = 10;
       System.out.println(a.tomato);
       a.tomato = 1;
       System.out.println(a.tomato);
        System.out.println(a.a);
    }
}

class Container <T> {
    public T tomato;
    public int a;
}
