import javax.security.sasl.SaslClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeftSmallerRightBigger {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");
                int [] arr= new int [n];
                for(int x =0;x<n;x++)
                {

                            arr[x] = Integer.parseInt(str[x]);

                }


             System.out.println(   getSmallerLeftBiggerRight(arr,n));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static int getSmallerLeftBiggerRight(int [] arr, int n)
    {
int result=-1;

//        System.out.println("here");
        int [] leftMax= new int [n];
        int [] rightmin= new int [n];
        int maxCurr=arr[0];
        int minCurr=arr[n-1];
        for(int i =0;i<n;i++)
        {
            maxCurr=Math.max(maxCurr,arr[i]);
            leftMax[i]=maxCurr;
        }

        for(int i =n-1;i>=0;i--)
        {
            minCurr=Math.min(minCurr,arr[i]);
            rightmin[i]=minCurr;
        }
        for(int i =1;i<n-1;i++)
        {
            if((arr[i]>=leftMax[i]) &&(arr[i]<=rightmin[i]))

            {
                return arr[i];
            }
        }

return -1;
    }

}
