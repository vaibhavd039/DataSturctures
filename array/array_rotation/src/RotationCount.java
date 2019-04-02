/*
Consider an array of distinct numbers sorted in increasing order.
The array has been rotated (clockwise) k number of times.
 Given such an array, find the value of k.
 */

import java.util.Scanner;

public class RotationCount {
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
    static int findPivot(int [] ary, int low , int high)
    {
        if(high<low)
            return -1;
        if(high==low)
            return low;
        int mid= (low+high)/2;
        if(mid <high && ary[mid-1]>ary[mid])
            return mid;
        if(mid>low && ary[mid+1]<ary[mid])
            return mid+1;
        if(ary[high]>ary[mid])
            return findPivot(ary,low,mid-1);
        return findPivot(ary, mid+1, high);

    }




    public static void main(String[] args)
    {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        reverse(ary,0,ary.length);
        reverse(ary,0, d);
        reverse(ary,d, ary.length);

        for(int i :ary)
        {
            System.out.println(i);
        }

     System.out.print(   findPivot(ary,0,ary.length-1));



    }
}
