package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int pal = 0;
        while (x > pal) {
            pal = (pal * 10) + (x % 10);
            x = x / 10;
        }
        return x == pal || x == pal / 10;
    }

    public static void main(String[] args) {
        PalindromeNumber solver = new PalindromeNumber();
        
        System.out.println("Is 121 a palindrome? " + solver.isPalindrome(121));  // true
        System.out.println("Is -121 a palindrome? " + solver.isPalindrome(-121)); // false
        System.out.println("Is 10 a palindrome? " + solver.isPalindrome(10));    // false
    }
}