package Problem_Set2B;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(5);
        System.out.println(f.getFibonacciNumber(0));
        System.out.println(f.getFibonacciNumber(1));
        System.out.println(f.getFibonacciNumber(6));
    }

    private int[] data;
    private int max;
    private int calls;

    Fibonacci(int max){
        this.max = max;
        data = new int[max];
        data[0] = 0; data[1] = 1;
    }

    public int getFibonacciNumber(int n){
        calls = 0;
        return n >= max ? -1: fibRecursive(n);
    }

    private int fibRecursive(int n){
        calls++;
        return data[n] = (n == 1 || n == 0 || data[n] != 0) ? data[n] : fibRecursive(n-1) + fibRecursive(n-2);
    }

    public int getCalls(){
        return calls;
    }

    public int[] getData(){
        return data;
    }
}


