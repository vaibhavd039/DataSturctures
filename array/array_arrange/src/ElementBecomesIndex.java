import java.util.Scanner;
/*
Given an array of size n where all elements are distinct and in range from 0 to n-1,
change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
*/
public class ElementBecomesIndex {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 0, 1, 4, 5, 3};
        rearrange(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }

    public static void rearrange(int [] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            arr[arr[i]%n]+=i*n;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]/=n;
        }

    }



}
