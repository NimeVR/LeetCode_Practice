package leetcode;

import java.util.*;
public class Pow {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Pow solution = new Pow();
        System.out.println("myPow(2.0, 10) = " + solution.myPow(2.0, 10));
        System.out.println("myPow(2.1, 3) = " + solution.myPow(2.1, 3));
        System.out.println("myPow(2.0, -2) = " + solution.myPow(2.0, -2));
    }
}   