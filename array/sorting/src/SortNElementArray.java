public class SortNElementArray {
    public static void main(String args[])
    {
        int []arr = {10, 7, 9, 2, 8,
                3, 5, 4, 6, 1};
        int n = arr.length;

        // for sort an array
        sortBySwaping(arr, n);

        // for print all the
        // element in sorted way
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public  static void sortit(int [] arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            arr[i]=i+1;


        }
    }
    public static void sortBySwaping(int [] arr, int n)
    {
         int temp=0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]!=i+1)
            {
                    temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
            }
        }
    }


}
