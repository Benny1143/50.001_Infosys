public class Question2 {

    public static void main(String[] args) {

        int a[] = {7, 10, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        System.out.println(sumUpTo(10)); // 55
        System.out.println( sumIntArrayAll(a) ); // 503
        System.out.println( sumIntArrayTwenty(a)); // 468
        System.out.println( countEvenNumbers(a)); // 6
        // Write code here to execute the functions yourself
        printLine();
        System.out.println(sumUpTo(9)); //45
        printLine();
        question2b();
        printLine();
        question2c();
        printLine();

    }
    static void question2b() {
        int [] a = {-12, 3, 20, 21, -15, 2};
        int [] b = {};
        int [] c = new int[10];
        int [][] d = {a,b,c};
        for(int[] i: d) {
            System.out.println(sumIntArrayAll(i)); // 19 0 0
        }
    }
    static void question2c() {
        int [] a = {-12, 3, 20, 21, -15, 22};
        int [] b = {};
        System.out.println(sumIntArrayTwenty(a)); // 42
        System.out.println(sumIntArrayTwenty(b)); // 0
    }
    static void printLine() {
        System.out.println("===========================");
    }
    static int sumUpTo( int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int sumIntArrayAll( int[] array){
        int sum = 0;
        for(int number: array) {
            sum += number;
        }
        return sum;
    }

    static int sumIntArrayTwenty( int[] array){
        int sum = 0;
        for(int number: array) {
            if(number > 20) {
                sum += number;
            }
        }
        return sum;
    }

    static int countEvenNumbers(int[] array){
        int count = 0;
        for(int number: array) {
            if (number%2==0) {
                count++;
            }
        }
        return count;
    }
}