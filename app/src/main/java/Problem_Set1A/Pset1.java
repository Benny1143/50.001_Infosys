package Problem_Set1A;


import java.util.HashSet;
import java.util.Set;

public class Pset1 {
    public static void main(String[] args) {
        System.out.println(Pset1.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(Pset1.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(Pset1.isPermutation("@ab", "a@b"));
        System.out.println(Pset1.isPermutation("abcd", "bcdA"));
    }

    public static boolean isAllCharacterUnique(String sIn) {
        Set<Character> a = new HashSet<>();
        for(String c : sIn.split("")) {
            a.add(c.charAt(0));
        }
        return sIn.length() == a.size();
    }
    public static boolean isPermutation(String sIn1, String sIn2) {
        return false;
    }
}
