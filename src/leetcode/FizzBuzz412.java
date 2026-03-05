package leetcode;

import java.util.*;

public class FizzBuzz412 {
    public void createlist(List<String> s, int n) {
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                s.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                s.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                s.add("Buzz");
            } else {
                String num = Integer.toString(i + 1);
                s.add(num);
            }
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<>();
        createlist(s, n);
        return s;
    }

    public static void main(String[] args) {
        FizzBuzz412 solution = new FizzBuzz412();
        System.out.println(solution.fizzBuzz(15));
    }
}   