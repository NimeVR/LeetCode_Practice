package leetcode;


public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        int winner = 0;
        int votecount = 0;

        for (int num : nums) {
            if (votecount == 0) {
                winner = num;
                votecount = 1;
            } else if (num == winner) {
                votecount++;
            } else {
                votecount--;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        MajorityElement169 solution = new MajorityElement169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        
        System.out.print("Array: ");
        printArray(nums);
        
        int result = solution.majorityElement(nums);
        System.out.println("\nMajority Element: " + result);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}   