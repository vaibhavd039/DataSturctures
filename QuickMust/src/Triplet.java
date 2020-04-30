import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Triplet
{
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
                int currmax=0;
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =0;x<n;x++)
                {
                    arr[x]=Integer.parseInt(str[x]);
                    currmax= Math.max(currmax, arr[x]);

                }
//                System.out.println( currmax);

                int [] index= new int[currmax+1];
                for(int x =0;x<n;x++) {
                    index[arr[x]]+=1;

                }
//                System.out.println("started");
                System.out.println( getTriplet( index,currmax+1));
            }
        }
        catch(Exception ex)
        {
        System.out.println("error");
    }
    }




    public static int getTriplet( int [] freq , int n)
    {
        int result =0;

        result+=freq[0]*(freq[0]-1) * (freq[0]-2) /6;

        for( int i =1;i<n;i++)
        {
            result+=freq[0] * freq[i] *(freq[i]-1)/2;
        }

        for(int i =0;i<n/2;i++)
        {
            result+=(freq[i] *(freq[i]-1)/2)* freq[2*i] ;
        }
        for(int i =1;i<n;i++)
        {
            for(int j =i+1;i+j<n;j++)
            {
                result+=freq[i] *freq[j]* freq[i+j] ;
            }
        }

        return result;
    }

}
