import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WaterTrapping {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                int n = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

                int [] arr= new int [n];

                for(int i =0;i<n;i++)
                {
                    arr[i] = Integer.parseInt(str[i]);
                }

                System.out.println(watertrap(arr, n));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static int watertrap(int [] arr, int n)
    {
        int result =0;
        int [] left= new int [n];
        int [] right = new int [n];
        left[0]=arr[0];
        for(int i =1;i<n;i++)
        {
            left[i]= Math.max(arr[i], left[i-1]);


        }
        right[n-1]=arr[n-1];
        for(int i =n-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i], right[i+1]);
        }

        for(int i =0;i<n;i++)
        {
            result+= Math.min(left[i], right[i])-arr[i];
        }

        return  result;
    }

}
