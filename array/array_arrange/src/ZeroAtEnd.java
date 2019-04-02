import java.util.Scanner;

public class ZeroAtEnd {
    public static void pushZeroInEnd(int [] arr)
    {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=0)
        {
            arr[count]=arr[i];
            count++;
        }
    }
    for(int j=count+1;j<arr.length;j++)
    {
        arr[j]=0;
    }
    }

    public static void pushZeroToEndSwap(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp= arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }


    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 0, -3, 4, 5,0,-11,-13,0,-12, 6, 0, 8, 9};
        pushZeroToEndSwap(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }
}
