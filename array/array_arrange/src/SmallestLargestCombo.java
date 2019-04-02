import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargestCombo {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 0, -3, 4, 5,0,-11,-13,0,-12, 6, 0, 8};
        arr= arrangeLargeSmallCombo(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }
    public static int [] arrangeLargeSmallCombo(int [] arr)
    {
        int [] temp = new int [arr.length];
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        for(int k=0;i <= arr.length / 2 || j > arr.length / 2;i++,j--)
        {
            if(k<arr.length)
            {
                temp[k]=arr[i];
                k++;
            }
            if(k<arr.length)
            {
                temp[k]=arr[j];
                k++;
            }


        }
        return temp;


    }

}
