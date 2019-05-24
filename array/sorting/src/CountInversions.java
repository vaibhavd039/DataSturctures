public class CountInversions {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 20, 6, 4, 5};
        System.out.println("Number of inversions are " + mergeSort(arr, 5));
    }
    static int mergeSort(int arr[], int array_size)
    {
        int temp[] = new int[array_size];
        return _mergeSort(arr, temp, 0, array_size - 1);
    }
    static int _mergeSort(int arr[], int temp[], int left, int right)
    {
        int mid, inv=0;
        if(left<right)
        {
            mid=(left+right)/2;
            inv+=_mergeSort(arr,temp,left,mid);
            inv+=_mergeSort(arr,temp,mid+1,right);
            inv += merge(arr, temp, left, mid + 1, right);
        }

        return inv;
    }
    static  int merge(int [] arr, int [] temp, int left, int mid, int right)
    {
        int i, j, k;
        int inv_count = 0;

        i = left; /* i is index for left subarray*/
        j = mid; /* j is index for right subarray*/
        k = left; /* k is index for resultant merged subarray*/
        while(i<=mid-1 && j<=right)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
                k++;
                inv_count+=(mid-i);
            }

        }
        while (i <= mid - 1)
            temp[k++] = arr[i++];

        /* Copy the remaining elements of right subarray
       (if there are any) to temp*/
        while (j <= right)
            temp[k++] = arr[j++];

        /*Copy back the merged elements to original array*/
        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;

    }

}
