package Example54;

public class Bird {

    private Example54.FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(Example54.FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void fly(){
        flyBehaviour.doFly();
    }
}
