import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MasSumSubSequence {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                int [] msis= new int [n];
                for(int x =0;x<n;x++)
                {
                    arr[x]=Integer.parseInt(str[x]);

                   msis[x]=arr[x];

                }
                System.out.println( getMaxSumSubSequence(arr,msis));
            }
        }
        catch(Exception ex)
        {

        }
    }
    public static int getMaxSumSubSequence(int [] arr, int [] msis)
    {
        int n=arr.length;
        if(n==1)
            return arr[0];

        for(int i=1;i<n;i++)
        {
            for(int j =0;j<i;j++)
            {
                if(arr[i]>arr[j] && msis[i]<msis[j]+arr[i])
                msis[i]=msis[j]+arr[i];
            }
        }
        int maxSum=msis[0];
        for(int i =1;i<n;i++)
        {
            maxSum=Math.max(maxSum,msis[i]);
        }

        return maxSum;
    }

}

