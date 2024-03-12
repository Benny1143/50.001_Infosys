package Revision;

import java.util.ArrayList;

public class Birds {
    public static void main(String[] args) {
        Bird o = new Ostrich();
        Bird e = new Eagle();
        ArrayList<Bird> a = new ArrayList<>();
        a.add(o);
        a.add(e);

        for(Bird b: a) {
            b.fly();
        }
    }
}
class Ostrich implements Bird {
    @Override
    public void fly() {
        System.out.println("I am a Ostrich");
    }
}

class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("I am a Eagle");
    }
}
interface Bird {
    void fly();
}
