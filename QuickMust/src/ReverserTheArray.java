import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverserTheArray {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                String [] nk = reader.readLine().trim().replaceAll(" +"," ").split("\\s");
                int  n= Integer.parseInt(nk[0]);
                int  k= Integer.parseInt(nk[1]);
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

                int [] arr= new int [n];

                for(int i =0;i<n;i++)
                {
                    arr[i] = Integer.parseInt(str[i]);
                }


               printReversal(arr,n,k);
            }
        }
        catch(Exception ex)
        {

        }
    }


    public static void printReversal(int [] arr, int n , int k)
    {

            int left, right;
            for(int i =0;i<n;i+=k)
            {
                 left=i;
                right =Math.min(n-1,  i+k-1);
                while(left<right)
                {
                    int temp= arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
            for(int a: arr)
            {
                System.out.print(a+" ");
            }
        System.out.println("");
    }

}
