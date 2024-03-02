package Week1;

import java.util.Scanner;

public class LoopingDemo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.println(name);
//        System.out.print("Enter Number: ");
//        int number = Integer.parseInt(scan.nextLine());
//        for (int i = 1; i < number; i++) {
//            System.out.println(i);
//        }

//        double [] numbers = {1.1,2.3,0.9};
//        for(double n: numbers){
//            System.out.println(n);
//        }
        Student a = new Student("Benny", 19);
//        String name = a.getName();
        System.out.println(a);
    }
}