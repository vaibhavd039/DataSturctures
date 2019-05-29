

public class SumGreaterThanValue {
    public static void main(String [] args)
    {
        int arr1[] = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
            System.out.println(res1);


    }
     static int smallestSubWithSum(int [] arr, int n, int x)
    {
        int curr_sum=0;
        int min=n+1;
        int start=0, end=0;
        while(end<n)
        {
            while(curr_sum<=x && end<n)
            {
                curr_sum+=arr[end];
                end++;
            }
            while(curr_sum>x && start<n)
            {
               if(min>end-start)
               {
                   min=end-start;
               }
                curr_sum-=arr[start];
                start++;
            }
            System.out.println("here");
        }
        return min;

    }


}
