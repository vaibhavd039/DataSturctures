
import java.util.*;
import java.math.*;
public class SumContinuousArray {
    public static void main(String [] args)
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = maxSubArraySum(a, n);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
   getMaxSubarry(a,n);



    }
    public static int kadane_getMax(int [] arr, int n)
    {
     int max_so_far=0;
     int max_here=0;
     for(int i=0;i<n;i++)
     {
         max_here=max_here+arr[i];
         if(max_here<0)
             max_here=0;
         else
         {
             if(max_here>max_so_far)
             {
                 max_so_far=max_here;
             }
         }
     }
        return max_so_far;
    }

    public static int maxSubArraySum(int [] arr, int n)
    {
        int curr_max=0;
        int max_so_far=0;
        for(int i=0;i<n;i++)
        {
            curr_max= Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(curr_max,max_so_far);

        }
        return max_so_far;

    }

    public static void getMaxSubarry(int [] arr, int n)
    {

        int curr_max=0;
        int max_so_far=0;
        int start=0, end=0, s=0;
        for (int i =0;i<n;i++)
        {
            curr_max=curr_max+arr[i];
            if(max_so_far<curr_max)
            {
                max_so_far=curr_max;
                start=s;
                end=i;
            }
            if(curr_max<0)
            {
            curr_max=0;
             s=i+1;
            }
        }

        System.out.println(max_so_far+" "+start+" "+end);

    }






}
