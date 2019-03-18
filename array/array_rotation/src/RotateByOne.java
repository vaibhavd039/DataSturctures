/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */

import java.util.*;

public class RotateByOne {

    public static int []  rotatebyone(int [] bry)
    {
        int temp=bry[0];
        for(int i=1;i<bry.length;i++)
        {
            bry[i-1]=bry[i];
        }
        bry[bry.length-1]=temp;
        return bry;

    }

    public static void main(String [] rags) {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for(int i=0;i<d;i++)
        {
           ary= rotatebyone(ary);
        }
        for(int i :ary)
        {
            System.out.println(i);
        }
    }


}
