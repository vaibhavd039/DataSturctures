/*
* Given an unsorted array of integers, sort the array into a wave like array. An array ‘arr[0..n-1]’
* s sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
* */
public class WaveSort {
    public static void main(String args[])
    {

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");
    }
    public static int[] sortInWave(int [] arr, int n)
    {
        for(int i =0;i<n;i+=2)
        {

                if(i>0 && arr[i]<arr[i-1])
                {
                    swap(arr, i,i-1);
                }
                if(i<n-1 && arr[i]<arr[i+1])
                {
                    swap(arr, i,i+1);
                }

        }
        return arr;

    }
    static void  swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

