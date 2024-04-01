package Problem_Set3B;

public class WithCouponYield implements YieldCalculation  {
    public double yieldToMaturity (Bond bond){
        double rUp = 1;
        double rDown = 1 * Math.pow(10, -10);
        double delta = rUp-rDown;
        while (delta > Math.pow(10,-5)){
            double rMiddle = 0.5*(rUp+rDown);
            double fMiddle = functionR(rMiddle,bond.getDuration(),bond.getFaceValue(),bond.getSellingPrice(), bond.getInterestPayment());
            double fUp = functionR(rUp,bond.getDuration(),bond.getFaceValue(),bond.getSellingPrice(), bond.getInterestPayment());
            double fDown = functionR(rDown,bond.getDuration(),bond.getFaceValue(),bond.getSellingPrice(), bond.getInterestPayment());
            if(isPositive(fMiddle) == isPositive(fUp)){
                rUp = rMiddle;
            }
            if(isPositive(fMiddle) == isPositive(fDown)){
                rDown = rMiddle;
            }
            delta = rUp-rDown;
        }
        return 0.5*(rUp+rDown);
    }
    public boolean isPositive(double d){
        return d >= 0;
    }
    public double functionR(double r, double duration, double faceValue, double sellingPrice, double interestPayment){
        return sellingPrice - (interestPayment)*(1-Math.pow((1/(1+r)), duration))/r -(faceValue/Math.pow((1+r),duration));
    }
}
