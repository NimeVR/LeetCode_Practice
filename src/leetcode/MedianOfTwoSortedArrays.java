package leetcode; // If you created a package, keep this line. If not, remove it.

public class MedianOfTwoSortedArrays {
    
    // This is your exact solution from LeetCode
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int t = n + m;
        int m1 = 0;
        int m2 = 0, i = 0, j = 0;
        int count = 0;
        
        while (count <= t / 2) {
            m2 = m1;
            if (i < n && j < m) {
                if (nums1[i] < nums2[j]) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
            count++;
        }
        
        if (t % 2 == 0) {
            return (m1 + m2) / 2.0;
        } else {
            return m1;
        }
    }

    // This main method allows you to run it in Eclipse to test
    public static void main(String[] args) {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();
        
        // Test Case 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solver.findMedianSortedArrays(nums1, nums2);
        
        System.out.println("Median is: " + result); // Should print 2.0
    }
}