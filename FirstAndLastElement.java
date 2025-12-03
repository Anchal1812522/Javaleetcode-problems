import java.util.Arrays;
public class FirstAndLastElement {

    public static void main(String[] args) {
       int[] nums = {5 , 7 , 7 , 8 , 8, 10 ,11};
       int target = 8;
       searchRange(nums , target);
       System.out.println(Arrays.toString(searchRange(nums , target)));

    }
    
    static int[] searchRange(int[] nums , int target){
        int[] ans = {-1,-1};
        int start = smallestNo(nums , target , true);
        int end = smallestNo(nums , target , false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int smallestNo(int[] nums , int target , boolean findNumber){
           int ans = -1; 
           int start = 0;
           int end = nums.length - 1;

           while(start <= end){
               int mid = start + (end - start) / 2;

               if(target < nums[mid]){
                end = mid -1;
               }else if(target > nums[mid]){
                start = mid + 1;
               }else{
                ans = mid;
                if(findNumber){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
               }
           }

           return ans;
        
    }
}


