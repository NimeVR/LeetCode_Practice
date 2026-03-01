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

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
    	Pow solution = new Pow();

        System.out.println("myPow(2.0, 10) = " + solution.myPow(2.0, 10)); // 1024.0
        System.out.println("myPow(2.1, 3) = " + solution.myPow(2.1, 3));     // 9.261
        System.out.println("myPow(2.0, -2) = " + solution.myPow(2.0, -2));   // 0.25

        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println("combinationSum([2,3,6,7], 7) = " + solution.combinationSum(candidates1, target1));

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println("combinationSum([2,3,5], 8) = " + solution.combinationSum(candidates2, target2));
    }
}   