package Week1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(20);
        s.add(20);
        s.add(100);
        s.add(20);
        s.add(20);

        for (Iterator<Integer> iter = s.iterator(); iter.hasNext(); ) {
            Integer val = iter.next();
            System.out.println(val);
            if(val > 90) {
                iter.remove();
            }
        }
        System.out.println(s);
    }
}
