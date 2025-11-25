import java.util.Arrays;
public class bubbleSort {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        System.out.println("Sorted Colors: " + Arrays.toString(nums));
    }
    
    public static void sortColors(int[] nums) {
         int low = 0;        // pointer for 0s (red)
        int mid = 0;        // pointer for 1s (white)
        int high = nums.length - 1; // pointer for 2s (blue)

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;   // 1 is already in correct region
            } 
            else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;  // move high pointer
            }
        }
    
}

    
}
