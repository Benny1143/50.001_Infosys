package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testtest {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int i = 0;
        a[i++] += 4;
        System.out.println(Arrays.toString(a));
        a[i] += 9;
        System.out.println(Arrays.toString(a));

    }
}
