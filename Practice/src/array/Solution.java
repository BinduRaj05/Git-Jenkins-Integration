package array;

public class Solution {
    
    public static long getInversions(long[] arr) {
        int n = arr.length;
        long totalInversions = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    totalInversions += 1;
                }

            }
        }

        return totalInversions;
    }


}