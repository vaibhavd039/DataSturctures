import java.util.*;

public class ReveserArray {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        for(int i =0;i<10;i++)
        {
            arr[i]=sc.nextInt();

        }

        reverseArray(arr,0,arr.length-1);


        for(int i: arr)
        {
            System.out.println(i);
        }

    }
    static void reverseArray(int [] arr, int low , int high)
    {

        if(low>=high)
            return;
        if(low<high)
        {
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
            reverseArray(arr,low,high);
        }

    }

}
