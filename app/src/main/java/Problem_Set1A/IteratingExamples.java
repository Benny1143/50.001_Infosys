package Problem_Set1A;
import java.util.*;

public class IteratingExamples {
    public static void main(String[] args) {
        System.out.println(Act2Iterator(Arrays.asList(1, 2, 3,4,5)));
    }
    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;
        for (Integer i: integers) {
            sum += i;
        }
        // Insert code here to sum up input using an Iterator ...

        return sum;
    }
}

