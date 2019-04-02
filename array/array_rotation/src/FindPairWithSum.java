/*
* Given an array that is sorted and then rotated around an unknown point.
 * Find if the array has a pair with a given sum ‘x’.
* It may be assumed that all elements in the array are distinct.*/
import java.util.Scanner;

public class FindPairWithSum {


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

    public static void findSum(int [] ary,int sum)
    {

        int n=ary.length;
        int i=findPivot(ary,0,ary.length-1);
        System.out.println(ary[i]);
       int j =(i+1)%n;

while(i!=j) {
    if(sum==ary[i]+ary[j])
    {
        System.out.println(ary[i]+" "+ary[j]+" ");
        return;
    }
    if (ary[i] + ary[j] < sum) {
        j = (j + 1) % n;
    }
    if (ary[i] + ary[j] > sum) {
        i = (n + i - 1) % n;
    }
}
        System.out.println("NOT POSSIBLE");
return ;


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

        int sum=  sc.nextInt();
        findSum(ary,sum);


    }
}
