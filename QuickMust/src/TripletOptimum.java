import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletOptimum {

    public static void main(String [] args)
    {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(reader.readLine());
                String[] str = reader.readLine().split("\\s");
                int[] arr = new int[n];
                for (int x = 0; x < n; x++) {
                    arr[x] = Integer.parseInt(str[x]);
                }
                Arrays.sort(arr);
                System.out.println(getTriplet(arr, n));
            }
        }
        catch(Exception ex)
        {

        }
    }

    public static int getTriplet(int [] arr , int n)
    {
int result=0;
int flag=0;
for(int i =n-1;i>=0;i--)
{
    int a= arr[i]; int b=0; int c=i-1;
    int x;
    while(b<c)
    {
        x=arr[b]+arr[c];
        if(x==a)
        {
            result++;
            b++;
            c++;
            flag=1;
        }
       else if(x<a)
            b++;
        else
            c--;
    }

}
if(flag==0)
    return -1;
return result;
    }
}
