package Example52;

public class BusFare2020 implements Example52.BusFare {

    private final int SHORTFARE = 100;
    private final int LONGFARE = 120;
    @Override
    public int getBusFare(int distance) {
        return distance < 32 ? SHORTFARE : LONGFARE;
    }
}
