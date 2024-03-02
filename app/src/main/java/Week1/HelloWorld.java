package Week1;
import java.math.BigDecimal;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String args[]){
        int a = 1;
        boolean b = true;
        System.out.print("asds");
        System.out.println("Hello World");
        double e = 0.05;
        double d = 0.06;
        System.out.println(e-d);
        BigDecimal X = new BigDecimal("0.05");
        BigDecimal Y = new BigDecimal("0.06");
        System.out.println(Y.subtract(X));

        int[] c;
        c = new int[3];
        c[0] = 22; c[1] = 39; c[2] = 9;
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        int[] arr1 = new int [] {22, 39, 9};
        System.out.println(Arrays.equals(arr1,c));
        int[] abc = arr1;
        abc[0] = 10;
        System.out.println(abc[0]);
        System.out.println(arr1[0]);
        int lengtha = arr1.length;
        System.out.println(arr1.length);
        System.out.println(lengtha);

        char[] stringa = {'1','a','f','l','1'};
        System.out.println(stringa);

        int inputa = 15;
        String l;
        if(inputa < 10) {
            l = "asdasd";
        } else if (inputa > 20){
            l = "aa";
        } else {
            l = "a";
        }
        System.out.println(l);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        double[] numbers = {1.3,2.9,9.9};
        for(double number: numbers) {
            System.out.println(number);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        Test("asdasd");
    }
    public static void Test(String s) {
        System.out.println("tomato" + s);
    }
}
