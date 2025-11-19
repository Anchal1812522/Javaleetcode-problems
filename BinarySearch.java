public class BinarySearch {
      //**********************************Simple binary Search implementation*********************************//
      public static void main(String[] args) {
        int[] arr = {-1 , 0 , 3 , 5 , 9 ,12};
        int target = 9;
        int result = search(arr , target);
        System.out.println(result);
      }

     static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

//**********************************************PEAK INDEX IN MOUNTAIN ARRAY*********************************//

 public static void main(String[] args) {
       int[] arr = {2 , 3 , 4 , 5 , 6 ,4 , 3, 2 ,1}; 
       int ans = findElem(arr);
       System.out.println(ans);
    }

    static int findElem(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        
        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                 start = mid + 1;
            }
        }
        return start;

    }

    //**********************************************FIND ELEMENT IN MOUNTAIN ARRAY*********************************//
