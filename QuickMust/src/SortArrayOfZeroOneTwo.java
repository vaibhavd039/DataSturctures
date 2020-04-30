import javax.security.sasl.SaslServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArrayOfZeroOneTwo {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int [] length = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                int [] arr = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

                printSortedArray( arr);
            }
        }
        catch(Exception ex)
        {

        }
    }

    public static void printSortedArray(int [] arr)
    {
        int [] result = new int [3];
        result[0]=0;
        result[1]=0;
        result[2]=0;
        for(int i =0;i<arr.length;i++)
        {
            result[arr[i]]++;
        }
        while(result[0]>0)
        {
            System.out.print(0+" ");
            result[0]--;
        }

        while(result[1]>0)
        {
            System.out.print(1+" ");
            result[1]--;
        }

        while(result[2]>0)
        {
            System.out.print(2+" ");
            result[2]--;
        }
        System.out.println("");
    }

}
