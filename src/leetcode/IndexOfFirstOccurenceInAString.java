package leetcode;

public class IndexOfFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    	IndexOfFirstOccurenceInAString solution = new IndexOfFirstOccurenceInAString();

        System.out.println(solution.strStr("sadbutsad", "sad")); 

        System.out.println(solution.strStr("leetcode", "leeto")); 

        System.out.println(solution.strStr("hello", "ll")); 
    }
}   