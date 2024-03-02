package Problem_Set2A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OctagonComparator implements Comparator<Octagon> {
    public static void main(String[] args) {
        ArrayList<Octagon> l = new ArrayList<Octagon>();
        l.add(new Octagon(2));
        l.add(new Octagon(3));
        l.add(new Octagon(1));
        Collections.sort(l, new OctagonComparator());
        for (Octagon o:l)
            System.out.println(o.getSide());
    }

    @Override
    public int compare(Octagon a, Octagon b) {
        return a.getSide() > b.getSide() ? 1 : -1;
    }
}
