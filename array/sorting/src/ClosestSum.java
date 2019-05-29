import java.util.Arrays;

public class ClosestSum {
    public static void main (String[] args)
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr, 6);
    }
  public static void   minAbsSumPair(int [] arr, int n)
  {
      Arrays.sort(arr);
      int i =0;
      int l=0,r=0;
      int j=n-1;
      int min_sum=Integer.MAX_VALUE;
      int sum=0;
      int abs_sum=0;
      while(i<j)
      {
          abs_sum= Math.abs(arr[i]+arr[j]);
          if(abs_sum<min_sum)
          {
              min_sum=abs_sum;
              l=i;
              r=j;
          }

          sum=arr[i]+arr[j];
          if(sum>0)
          {
              j--;
          }
          else if (sum<0)
          {
              i++;
          }





      }
      System.out.println(arr[l]+" "+arr[r]+" "+min_sum);
  }

}

