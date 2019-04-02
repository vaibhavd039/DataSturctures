import java.util.*;
/*
* Given an array and a number k where k is smaller than size of array,
 * we need to find the k’th largest element in the given array.
* It is given that ll array elements are distinct.
* \*/
public class KthQuickSort {
    public static void main(String [] arhs)
    {
        int [] arr= {23,45,5,6,3,11,7,8,9};
        Scanner sc= new Scanner(System.in);
        System.out.println( optemisedQuick(arr,0,arr.length,3)) ;

    }
    public  static int optemisedQuick(int [] arr, int l, int h, int k)
    {
        if(k>0 && k<=(h-l+1))
        {
            int pos= partition(arr, l,h);
            if(pos-1==k-1)
                return arr[pos];
            if(pos-1>k-1)
                return optemisedQuick(arr,l,pos-1,k);
            else
                return optemisedQuick(arr,pos,h,k);

        }
        else
            return -1;
    }
    public   static int partition(int [] arr, int l , int h)
    {
        int x=arr[h-1];
        int i=l;
        for(int j =l;j<=h-1;j++)
        {
            if(arr[j]<x)
            {
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }

        int temp= arr[i];
        arr[i]=arr[h-1];
        arr[h-1]=temp;
        return i;

    }



}
