package Week1;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
//        Integer[] a = new Integer[50000];
//        LinkedList<Integer> linkedlist = new LinkedList<Integer>(Arrays.asList(a));
//        int totalCnt = 10000;
//
//        long started = System.nanoTime();
//        for (int k = 0; k < totalCnt; k++) {
//            linkedlist.add(0,9);
//        }
        Tomato a = new Tomato();
        System.out.println(a instanceof Object);
        System.out.println(a instanceof Tomato);
        a.setNumber("op");
        System.out.println(a.getNumber());
        a.setNumber(100);
        System.out.println(a.getNumber());
    }
}

class Tomato<T> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}