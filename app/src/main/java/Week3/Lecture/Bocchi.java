package Week3.Lecture;

public class Bocchi {
    public static void main(String[] args) {
        String a = "Bocchi";
        System.out.println(a == "Bocchi"); // True
        System.out.println(a.equals("Bocchi")); // True
        System.out.println(a == new String("Bocchi")); // False
    }
}
