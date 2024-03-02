package Example53;

public class Bird {

    public void fly(){
        System.out.println("I CAN fly");
    }

    public void swim(){
        System.out.println("I can't swim");
    }
}

class DomesticDuck extends Bird{

    @Override
    public void fly(){
        System.out.println("I can't fly");
    }

    @Override
    public void swim(){
        System.out.println("I CAN swim");
    }

}

class CanadaGoose extends Bird{

    @Override
    public void swim(){
        System.out.println("I CAN swim");
    }
}


class Pigeon extends Bird{

    @Override
    public void fly(){
        System.out.println("I CAN fly long distances");
    }

}

class Ostrich extends Bird{

    @Override
    public void fly(){
        System.out.println("I can't fly");
    }

    @Override
    public void swim(){
        System.out.println("I can't swim");
    }

}
