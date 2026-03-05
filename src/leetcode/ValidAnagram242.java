package leetcode;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        int ss = s.length();
        int tt = t.length();

        if (ss != tt) {
            return false;
        } else {
            int[] arr = new int[26];
            for (int i = 0; i < ss; i++) {
                arr[s.charAt(i) - 'a'] += 1;
                arr[t.charAt(i) - 'a'] -= 1;
            }

            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Example usage and test cases
    public static void main(String[] args) {
        ValidAnagram242 solution = new ValidAnagram242();

        System.out.println(solution.isAnagram("anagram", "nagaram")); 

        System.out.println(solution.isAnagram("rat", "car")); 

        System.out.println(solution.isAnagram("listen", "silent")); 
    }
}   