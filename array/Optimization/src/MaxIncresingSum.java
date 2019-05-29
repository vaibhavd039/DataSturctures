import javax.print.DocFlavor;

public class MaxIncresingSum {
    public static void main(String[] arhs) {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum " +
                "increasing subsequence is " +
                maxSumIS(arr, n));
    }

    static int  maxSumIS(int arr[], int n) {
        int[] msis = new int[n];
        for (int i = 0; i < n; i++) {
            msis[i] = arr[i];

        }
        int max_sum=0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && msis[i] < msis[j] + arr[i]) {
                    msis[i] = msis[j] + arr[i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
                if(max_sum<msis[i])
                    max_sum=msis[i];

        }
        return max_sum;

    }
}
