
import java.util.*;
public class mediansorted {
        public static void main(String[] args) {
            int[] num1 = {1 ,3 , 5};
            int[] num2 = {2 , 4 , 6 ,8};
            mediansorted sol = new mediansorted();
           double median = sol.findMedianSortedArrays(num1, num2);
           System.out.println("Median is: " + median);       

        }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {
            int cut1 = left + (right - left) / 2;   // partition in nums1
            int cut2 = (m + n + 1) / 2 - cut1;      // partition in nums2

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            // Valid partition found
            if (left1 <= right2 && left2 <= right1) {
                // If total length is even
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2)- + Math.min(right1, right2)) / 2.0;
                }
                // If total length is odd
                else {
                    return Math.max(left1, left2);
                }
            } 
            // Move left
            else if (left1 > right2) {
                right = cut1 - 1;
            }
            // Move right
            else {
                left = cut1 + 1;
            }
        }

        return 0.0; 
    }
}

