package Problem_Set3B;

public class TestBond {
    public static void main(String[] args) {
        Bond.BondBuilder bondBuilder = new Bond.BondBuilder();
        Bond bond1 = bondBuilder.setDuration(4)
                .setFaceValue(1000)
                .setSellingPrice(900)
                .setInterestPayment(10).createBond();
        bond1.setYieldCalculation(new WithCouponYield());
        System.out.println("" + bond1.calculateYTM());

        Bond bond2 = bondBuilder
                .setDuration(1)
                .setFaceValue(1000)
                .setSellingPrice(900)
                .setInterestPayment(0).createBond();
        bond2.setYieldCalculation(new ZeroCouponYield());
        System.out.println("" + bond2.calculateYTM());
    }
}
