public class MergeInPelindrome {

    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+
                findMinOps(arr, arr.length));

    }
    static int findMinOps(int[] arr, int n)
    {
        int counter=0;
        int i =0;
        int j =n-1;
        for( ;i<=j;)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;

            }
            else
            {
                if(arr[i]>arr[j])
                {
                    arr[j-1]+=arr[j];
                    j--;
                    counter++;
                }
                if(arr[i]<arr[j])
                {
                    arr[i+1]+=arr[i];
                    i++;
                    counter++;
                }

            }

        }
        return counter;

    }

}
