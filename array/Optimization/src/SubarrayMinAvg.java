//Given an array arr[] of size n and integer k such that k <= n.

import java.util.Scanner;

public class SubarrayMinAvg {
    public static void main(String [] args)
    {
        int [] arr={ 3, 7, 90, 20, 10, 50, 40 };
        int n=arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
     getMinArg(arr,n,k );

    }
    public static void getMinArg( int [] arr, int n, int k)
    {
       int start=0;
       int curr_max=0;
       int min_sum=0;
       for(int i=0;i<k;i++)
       {
           curr_max+=arr[i];
       }
       min_sum=curr_max;
       for(int i=k;i<n;i++)
       {  curr_max= curr_max+arr[i]-arr[i-k];
          if(min_sum>curr_max)
          {
              start=i-k+1;
              min_sum=curr_max;
          }


       }
       System.out.println(start +" "+(start+k-1));


    }


}
