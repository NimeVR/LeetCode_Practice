package leetcode;

public class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
    	MoveZeros283 solution = new MoveZeros283();
        int[] nums = {0, 1, 0, 3, 12};

        System.out.print("Original array: ");
        printArray(nums);

        solution.moveZeroes(nums);

        System.out.print("\nAfter moving zeroes: ");
        printArray(nums);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
}   
}

