package Week2;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(9);
        a.add(1);
        a.add(6);
        for(Object b: a.toArray()) {
            System.out.println((int) b);
        }
    }
}
