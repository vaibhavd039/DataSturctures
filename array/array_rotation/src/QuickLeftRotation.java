/*
Given an array of size n and multiple values around which we need to left rotate the array.
How to quickly find multiple left rotations?
* */
import java.util.Scanner;

public class QuickLeftRotation {
    static int [] copyArray(int [ ] ary)
    {
        int n= ary.length;
        int [] temp= new int [2*n];
        for(int i=0;i<n;i++)
        {
            temp[i]=temp[i+n]=ary[i];
        }
        return temp;
    }

    public static void quickrotation(int [] temp, int k, int n)
    {

        int start=k%n;
        for(int i=start; i<start+n;i++)
        {
            System.out.print(temp[i]+"\t");
            System.out.println(" ");
        }
        return;
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
        int [] temp=copyArray(ary);
        int k=sc.nextInt();
        while(k!=0)
        {


            quickrotation(temp,k,ary.length);
            System.out.println("Value of key");
            k=sc.nextInt();

        }







    }
}
