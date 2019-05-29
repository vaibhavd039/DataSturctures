/*

We are given desired array target[] containing n elements. Compute and return the
 smallest possible number of the operations needed to change
  the array from all zeros to desired array.
 */

public class GetDesiredArray {
    public static void main(String[] args) {
        int arr[] = new int[]{16, 16, 16} ;
        System.out.println("Minimum number of steps required to \n" +
                "get the given target array is "+
                countMinOperations(arr,arr.length));

    }
    public static int countMinOperations(int [] arr, int n)
    {
        int zeros=0;
        int result=0;
        int i=0;
        while(true){

            for( i=0;i<n;i++)
            {
                if(arr[i]==0)
                    zeros++;
                if(arr[i]%2==1)
                    break;
            }
            if(zeros==n)
               return  result;
            if(i==n)
            {
                for (int j=0; j<n; j++)
                    arr[j] = arr[j]/2;
                result ++;
            }
            for(int j =i;j<n;j++)
            {
                if (arr[j] %2 == 1)
                {
                    arr[j]--;
                    result++;
                }
            }

        }

    }


}
