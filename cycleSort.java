import java.util.ArrayList;
import java.util.List;

public class cycleSort {
   
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4, 1, 4};
        List<Integer> ans = allDuplicates(arr);
        System.out.println(ans);   // Output: [1, 4]
    }

    static List<Integer> allDuplicates(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            // If arr[i] is not at the correct index, swap it
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After placing numbers, find all duplicates
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                // avoid adding same duplicate twice
                if (!result.contains(arr[j])) {
                    result.add(arr[j]);
                }
            }
        }

        return result;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
