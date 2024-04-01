package Problem_Set3B;

public class ZeroCouponYield  implements YieldCalculation  {
    public double yieldToMaturity (Bond bond){
        return Math.pow(bond.getFaceValue()/bond.getSellingPrice(), 1/bond.getDuration())-1;
    }
}
