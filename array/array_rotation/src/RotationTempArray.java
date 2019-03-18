/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */

import java.util.*;
public class RotationTempArray {
    public static void main(String [] rags)
    {
        int [] ary= new int[10];
        for(int i =0;i<10;i++)
        {
            ary[i]=i+1;
        }
        Scanner sc= new Scanner(System.in);
        int d= sc.nextInt();
        int []temp= new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=ary[i];
        }
        for(int i=0;i<ary.length-d;i++)
        {
            ary[i]=ary[i+d];
        }
        int j=ary.length-d;
        for(int i=0;i<d;i++)
        {
            ary[j]=temp[i];
            j++;
        }
        for(int i :ary)
        {
            System.out.println(i);
        }

    }
}
