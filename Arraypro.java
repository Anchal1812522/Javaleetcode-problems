public class Arraypro {
    public static void main(String[] args) {
        Arraypro ap = new Arraypro();
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int result = ap.maxValue(arr);
        System.out.println(result);
    }
    public int maxValue(int[] nums) {
        int max1 = Integer.MIN_VALUE;  // largest
        int max2 = Integer.MIN_VALUE;  // second largest
        int min1 = Integer.MAX_VALUE;  // smallest

        for (int x : nums) {
            // Update max1 and max2
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }

            // Update min1
            if (x < min1) {
                min1 = x;
            }
        }

        return max1 + max2 - min1;
    }
}
