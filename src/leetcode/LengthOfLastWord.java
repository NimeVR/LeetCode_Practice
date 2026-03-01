package leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }

    public static void main(String[] args) {
    	LengthOfLastWord solution = new LengthOfLastWord();

        String s1 = "Hello World";
        System.out.println("Input: \"" + s1 + "\" → Output: " + solution.lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Input: \"" + s2 + "\" → Output: " + solution.lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println("Input: \"" + s3 + "\" → Output: " + solution.lengthOfLastWord(s3));
    }
}   