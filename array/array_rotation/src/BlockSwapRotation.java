/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */

import java.util.Scanner;

public class BlockSwapRotation {
    public static void blockswap(int []ary, int fi, int si, int d)
    {

        int temp,i=0;
        while(i<d)
        {
            temp=ary[fi];
            ary[fi]=ary[si];
            ary[si]=temp;
            si++;
            fi++;
            i++;
        }
    }
    public static void leftRotate(int [] ary, int d)
    {
        if(d == 0 || d == ary.length)
            return;

            int i=d;
            int j=ary.length-d;
            while(i!=j)
            {
                if(i<j)
                {
                    blockswap(ary,d-i,d+j-i,i);
                    j=j-i;
                }
                if(i>j)
                {
                    blockswap(ary,d-i,d,j);
                    i=i-j;
                }

            }
            blockswap(ary,d-i,d,i);
    }


    public static void main(String[] args) {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        System.out.print("Input D");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        leftRotate(ary,d);
        for(int i :ary)
        {
            System.out.println(i);
        }


    }
}
