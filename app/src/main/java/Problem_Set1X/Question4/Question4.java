public class Question4 {

    public static void main(String[] args) {

        System.out.println( binaryToDecimal("")); // 1011
        //execute your function with your own test cases

    }

    static int binaryToDecimal( String s){
        int sum = 0;
        int increment = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            sum += Character.getNumericValue(s.charAt(i)) * Math.pow(2, increment);
            increment++;
        }
        return sum;
    }
}
