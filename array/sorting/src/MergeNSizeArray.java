public class MergeNSizeArray {
    public static void main(String[] args) {

        /* Initialize arrays */
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;

        /*Move the m elements at the end of mPlusN*/
        moveToEnd(mPlusN, m + n);

        /*Merge N[] into mPlusN[] */
        merge(mPlusN, N, m, n);

        /* Print the resultant mPlusN */
        printArray(mPlusN, m + n);
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println("");
    }

    static void moveToEnd(int[] mPlusN, int x) {
        int i, j = x - 1;
        for (i = x - 1; i >= 0; i--) {
            if (mPlusN[i] != -1) {
                mPlusN[j] = mPlusN[i];
                j--;
            }

        }

    }

    static void merge(int[] mPlusN, int[] N, int m, int n) {

        int k = 0;
        int i = 0;
        int j = n;
        while (k < m + n) {
            if (j < (m + n) && mPlusN[j] <= N[i] || i == n) {
                mPlusN[k] = mPlusN[j];
                j++;
                k++;

            } else {
                mPlusN[k] = N[i];
                i++;
                k++;

            }


        }


    }
}
