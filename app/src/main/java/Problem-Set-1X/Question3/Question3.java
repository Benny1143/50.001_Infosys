public class Question3 {

    public static void main(String[] args) {

        System.out.println( termsRequired(0.9)); // 6

    }

    static int termsRequired(double p){
        double compare = (p*Math.pow(Math.PI,2)/6);
        double sum = 0;
        int i = 1;
        while(true) {
            sum += 1/Math.pow(i,2);
            if(sum >= compare) {
                return i;
            }
            i++;
        }
    }
}
