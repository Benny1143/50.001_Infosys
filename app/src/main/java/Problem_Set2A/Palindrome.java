package Problem_Set2A;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba".toCharArray()));
        System.out.println(isPalindrome("adbcba".toCharArray()));
        System.out.println(isPalindrome("ZZaZZ".toCharArray()));
        System.out.println(isPalindrome("123421".toCharArray()));
        System.out.println(isPalindrome("".toCharArray()));
        System.out.println(isPalindrome(" ".toCharArray()));
    }
    public static boolean isPalindrome (char[] S) {
        if (S.length == 1 || S.length ==0) {
            return true;
        }
        if (S[0] == S[S.length-1]) {
            return isPalindrome(Arrays.copyOfRange(S, 1, S.length-1));
        }
        return false;
    }
}


/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/
