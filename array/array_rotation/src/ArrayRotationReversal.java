/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */

import java.util.*;


public class ArrayRotationReversal {
    static void reverse(int [] ary, int start, int end)
    {
   int temp;
   while(start<end)
   {
       temp=ary[start];
       ary[start]=ary[end-1];
       ary[end-1]=temp;
       start++;
       end--;
   }
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

    }


}
