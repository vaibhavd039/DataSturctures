public class SubArrayMaxAvg {
    public static void main (String[] args)
    {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        int n = arr.length;
        System.out.println( "The maximum average"
                + " subarray of length " + k
                + " begins at index "
                + findMaxAverage(arr, n, k));
    }
    static int findMaxAverage(int [] arr, int n , int k)
    {
        int curr_sum=0, all_max=0;
      int   start=0;
        for(int i =0;i<k;i++)
        {
            curr_sum+=arr[i];

        }
        all_max=curr_sum;
        for(int i=k;i<n;i++)
        {
            curr_sum=curr_sum+arr[i]-arr[i-k];
            if(curr_sum>all_max)
            {
                all_max=curr_sum;
                start=i-k+1;
            }

        }
        return start;
    }

}
