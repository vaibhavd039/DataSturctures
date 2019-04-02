/*
Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number.
 Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0.
After the modification, rearrange the array such that all 0’s are shifted to the end.
 */

import java.util.Scanner;

public class DoubleElementPushZeroTOEnd {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        doubleElement(arr);
        for(int i: arr)
        {
            System.out.print(i+"\t");
        }
        pushZeroToend(arr);
        System.out.println("after push");
        for(int i: arr)
        {
            System.out.print(i+"\t");
        }

    }

    public static void doubleElement(int [] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1] && arr[i]!=0)
                {
                arr[i]*=2;
                arr[i+1]=0;
                i++;
        }
        }
    }
    public static void pushZeroToend(int [] ary)
    {
        int count=0;
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]!=0)
            {
               int temp= ary[count];
               ary[count]=ary[i];
               ary[i]=temp;
            count++;
            }

        }
    }




}
