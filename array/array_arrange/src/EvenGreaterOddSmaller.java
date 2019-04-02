import java.util.*;

public class EvenGreaterOddSmaller {
    public  static int [] arrangeEvenLargerOddSmaller(int [] arr)
    {
     Arrays.sort(arr);
     int start=0;
    int end=arr.length-1;
     int [] temp= new int [arr.length];
     for(int i=0;i<arr.length;i++)
     {
         if((i+1)%2==0)
         {
temp[i]=arr[end];
end--;
         }
         else
         {
             arr[i]=arr[start];
             start++;
         }
     }
     return  temp;
    }


    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 0, -3, 4, 5,0,-11,-13,0,-12, 6, 0, 8, 9};
        arr= arrangeEvenLargerOddSmaller(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }

}
