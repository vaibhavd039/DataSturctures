/*Given an array of size n and multiple values around which we need to left rotate the array.
 How to quickly print multiple left rotations?
* */

import java.util.Scanner;

public class OptemisedLeftRotation {

    public static void optemisedLeftRotate(int []ary, int n , int k)
    {
        int start= k%n;
        for(int i=0;i<n;i++)
        {
            System.out.print(ary[start]);
            System.out.println(" ");
            start=(start+i)%n;
        }

    }

    public static void main(String[] args)
    {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        Scanner sc = new Scanner(System.in);

        for(int i :ary)
        {
            System.out.println(i);
        }

        int k = sc.nextInt();
        while(k!=0)
        {
            optemisedLeftRotate(ary,k,ary.length);
            System.out.println("Value of key");
            k=sc.nextInt();
        }

    }
}
