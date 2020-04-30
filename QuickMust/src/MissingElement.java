import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingElement {
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

                    for(int x =0;x<n-1;x++)
                {
                    int ind=Integer.parseInt(str[x]);
                    arr[ind-1]=1;
                }
                for(int x =0;x<n;x++)
                {
                   if(arr[x]==0)
                       System.out.println( x+1);
                }

            }
        }
        catch(Exception ex)
        {

        }
    }
}
