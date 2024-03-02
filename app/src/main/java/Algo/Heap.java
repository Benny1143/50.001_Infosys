package Algo;

public class Heap {
    public static void main(String[] args) {
        int[] a = max_heapify(new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1}, 1);
        printArray(a);
    }

    static void printArray(int[] a) {
        System.out.println("=======================");
        for (int element : a) {
            System.out.println(element);
        }
    }

    static int left(int[] a, int i) {
        return i* 2;
    }

    static int right(int[] a, int i) {
        return i * 2 + 1;
    }

    static int[] max_heapify(int[] a, int i) {
        int heap_size = a.length;
        int l = left(a, i);
        int r = right(a, i);
        int largest;
        if (l <= heap_size && a[l] > a[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= heap_size && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            int index = a[i];
            a[i] = a[largest];
            a[largest] = index;
            a = max_heapify(a, largest);
        }
        return a;
    }
}