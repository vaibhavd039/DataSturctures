import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
               int n = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));

//                int n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

                int [] arr= new int [n];

                for(int i =0;i<n;i++)
                {
                    arr[i] = Integer.parseInt(str[i]);
                }
                int m = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));

                Arrays.sort(arr);
                System.out.println(getMinDiffChocolate(arr, n, m));
            }
        }
        catch(Exception ex)
        {
System.out.println(ex.getMessage());
        }
    }

    public static int getMinDiffChocolate(int [] arr  , int n , int m)
    {

        int result=Integer.MAX_VALUE;

        for(int i =0;i+m-1< n;i++)
        {
            int diff= arr[i+m-1]-arr[i];

            if(diff<result) {
                result = diff;

            }
        }
        return  result;
    }

}
