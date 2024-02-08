package recursion;

public class Palindrome {
    public static boolean checkPalindrome(String s, int i) {
        int n = s.length();

        if (i >= n / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return checkPalindrome(s, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("MADAM",0));
    }
}
