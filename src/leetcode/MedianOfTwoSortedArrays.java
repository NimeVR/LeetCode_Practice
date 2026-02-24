package leetcode; 

public class MedianOfTwoSortedArrays {
    
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

    public static void main(String[] args) {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solver.findMedianSortedArrays(nums1, nums2);
        
        System.out.println("Median is: " + result); 
    }
}