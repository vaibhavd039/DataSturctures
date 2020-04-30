import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlatformNeeded {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                int n= Integer.parseInt(reader.readLine().trim());
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");
                String [] str2 = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

                int [] arr= new int [n];
                int [] dpr= new int [n];
                for(int i =0;i<n;i++)
                {
                        arr[i] = Integer.parseInt(str[i]);
                        dpr[i] = Integer.parseInt(str2[i]);
                }

                Arrays.sort(arr);
                Arrays.sort(dpr);
                System.out.println(platformRequired(arr,dpr,n));
            }
        }
        catch(Exception ex)
        {

        }
    }
        public static int platformRequired(int [] arr, int [] dpr, int n) {
            int i =0,j=0;
        int result =0;
        int  platform=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dpr[j])
            {
                platform++;
                i++;
                if(platform>result)
                    result=platform;
            }
            else
            {
                platform--;
                j++;
            }
        }
        return result;
        }
}
