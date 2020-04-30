import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EquiliberiumPOint {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
                int sum=0;
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =0;x<n;x++)
                {
                    arr[x]=Integer.parseInt(str[x]);
                    sum+=arr[x];

                }
               System.out.println( getEquiliberium(sum,arr));
            }
        }
        catch(Exception ex)
        {

        }
    }
    public static int getEquiliberium(int sum, int [] arr)
    {
     int n =arr.length;

     int second=sum;
     int first=0;

int flag=0;
     for(int i=0;i<n;i++)
     {

         second-=arr[i];
         if(first==second)
         {
            return i+1;
         }
         first+=arr[i];

     }





return -1;
    }

}
