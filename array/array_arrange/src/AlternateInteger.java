import java.util.Scanner;

public class AlternateInteger {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1, 2, -3, 4, 5,-10,-11,-13,-14,-12, 6, -7, 8, 9};
        rearrange(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }


    public static void rearrange(int [] arr)
    {
        int i=-1;
        int temp;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
            {
                    i++;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

            }

        }

        int pos=i+1;
        int neg=0;
        while(pos<arr.length && neg<pos && arr[neg]<0)
        {
            int a=arr[pos];
            arr[pos]= arr[neg];
            arr[neg]=a;
            pos++;
            neg+=2;

        }
    }

}
