import java.util.Scanner;

/*
*Given an array of positive and negative numbers, arrange them such that
 *  all negative integers appear before all the positive integers in the array without
 *  using any additional data structure like hash table, arrays, etc.
* The order of appearance should be maintained.
* */
public class NegativeBeforePostive {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 2, -3, 4, 5,-10,-11,-13,-14,-12, 6, -7, 8, 9};
        rearrangeSorting(arr,0,arr.length-1);

        for(int i: arr)
        {
            System.out.println(i);
        }

    }
    public static void rearrangeSorting(int [] arr, int low , int high)
    {
        if(low<high)
        {
            int m= (low+high-1)/2;
            rearrangeSorting(arr, low, m);
            rearrangeSorting(arr, m+1, high);
            merge(arr, low, m, high);
        }
    }

    static void merge(int [] arr, int low, int m, int high)
    {

        int i, j, k;
        int n1=m-low+1;
        int n2=high-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for( i=0;i<n1;i++)
        {
            L[i]= arr[low+i];
        }
        for( j=0;j<n2;j++)
        {
            R[j]= arr[j+m+1];
        }
        // Initial index of first subarray
        i = 0;

        // Initial index of second subarray
        j = 0;

        // Initial index of merged subarray
        k = low;
        while (i < n1 && L[i] < 0)
            arr[k++] = L[i++];

        // copy negative elements of right subarray
        while (j < n2 && R[j] < 0)
            arr[k++] = R[j++];

        // copy positive elements of left subarray
        while (i < n1)
            arr[k++] = L[i++];

        // copy positive elements of right subarray
        while (j < n2)
            arr[k++] = R[j++];
    }


}
