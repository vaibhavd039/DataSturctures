import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.Arrays;

public class SubArrayWithSum {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
               int [] sum_num = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                int [] arr = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                int n =sum_num[0];
                int sum=sum_num[1];
                getSubArray(sum, arr);
            }
        }
        catch(Exception ex)
        {

        }
    }
    public static void getSubArray(int sum ,int [] arr)
    {
        int start =0;
        int end =1;

        int length=arr.length;
        if(length==1)
        {
            if(arr[start]==sum)
            {
                System.out.println((1)+" "+(1));
            }
            else
            {
                System.out.println(-1);
            }
        }
        int sum_sub_array=0;
        int flag=0;
        for( int i =0;i<arr.length;i++)
        {
            sum_sub_array+=arr[i];
            while(sum<sum_sub_array)
            {
                sum_sub_array-=arr[start];
                start++;
            }
            if(sum_sub_array==sum)
            {
                flag=1;
                System.out.println((start+1)+" "+(i+1));
                break;

            }

        }
        if(flag==0)
        {

            System.out.println(-1);

        }





    }




}
