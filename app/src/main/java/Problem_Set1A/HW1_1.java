package Problem_Set1A;

public class HW1_1 {
    public static void main(String[] args) {
        int[] a = new int[] {3,4,7,14,23,99};
        for(int number: a) {
            System.out.println(isPrime(number));
        }
    }
    public static int isPrime(int num){
        boolean remainA = (((num-1)/6.0)%1 == 0);
        boolean remainB = (((num+1)/6.0)%1 == 0);
        return (remainA || remainB) ? 1 : 0;
    }
}
