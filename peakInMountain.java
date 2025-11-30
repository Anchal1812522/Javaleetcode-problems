public class peakInMountain {

    public static void main(String[] args) {
        peakInMountain obj = new peakInMountain();
        int[] arr = {0 , 2  , 1 , 7};
        int result = obj.peakIndexInMountainArray(arr);
        System.out.println("peak index is: "+ result);
    }
    
    static int peakIndexInMountainArray(int[] arr) {
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
}

