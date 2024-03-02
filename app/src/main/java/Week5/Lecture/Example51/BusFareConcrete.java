package Example51;

public class BusFareConcrete {
    private final int SHORTFARE = 100;
    private final int LONGFARE = 120;

    public int getBusFare(int distance){
        if( distance < 32){
            return SHORTFARE;
        }else{
            return LONGFARE;
        }
    }
}
