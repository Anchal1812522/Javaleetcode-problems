public class orderAgnostic{
 //**********************************************FIND ELEMENT IN MOUNTAIN ARRAY*********************************//

    public static void main(String[] args) {
       int[] arr = {2 , 3 , 4 , 5 , 6 ,4 , 3, 2 ,1}; 
       int target = 8;
       System.out.println(binarySeacrh(arr , target));
    }

    static int binarySeacrh(int[] arr , int target){
        int peak = findElem(arr);
        int start = orderAgnostic(arr , target , 0 , peak);
        if(start != -1){
            return start;
        }

        int end = orderAgnostic(arr , target , peak + 1 , arr.length -1);
        return end;
    }

    static int findElem(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        
        while(start < end){
            int mid = start + (end - start) /2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                 start = mid + 1;
            }
        }
        return start;

    }

    static int orderAgnostic(int [] arr , int target , int start , int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid =  start + (end - start ) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;

                }
            }
        }

        return -1;
    }
} 
