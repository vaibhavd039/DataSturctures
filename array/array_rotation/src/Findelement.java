import java.util.Scanner;

public class Findelement {

        static void reverse(int[] ary, int start, int end) {
            int temp;
            while (start < end) {
                temp = ary[start];
                ary[start] = ary[end - 1];
                ary[end - 1] = temp;
                start++;
                end--;
            }
        }


    public static int findPivot(int [] ary, int low, int high)
    {
        int mid=(low+high)/2;
        if (high<low)
            return -1;
        if(low==high)
            return low;
        if(ary[mid]>ary[mid+1])
            return mid;
        if(ary[mid]<ary[mid-1])
            return mid-1;
        if(ary[low]>ary[mid])
            return findPivot(ary,low,mid-1);
        return findPivot(ary,mid+1,high);
    }



        public static int findElement(int [] ary, int key)
        {
           int p= findPivot(ary,0,ary.length-1);

                   if(ary[p]==key)
                       return p;
                   if(ary[0]<key)
                       return binarySearch(ary,0,p-1,key);
                   return binarySearch(ary,p+1,ary.length,key);
        }
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }




    public static void main(String[] args)
    {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        reverse(ary,0, d);
        reverse(ary,d, ary.length);
        reverse(ary,0,ary.length);
        for(int i :ary)
        {
            System.out.println(i);
        }

int key=  sc.nextInt();
        System.out.println("index of "+key+" is:"+ findElement(ary,key));



    }
}
