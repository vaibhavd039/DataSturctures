import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KadaneAlgorithm {
    public static void main(String [] args)
    {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for (int i = 0; i < t; i++) {
                int max_so_far=0;
                int max_till_here=0;
                int min_curr=Integer.MIN_VALUE;
                int n = Integer.parseInt(reader.readLine());
                String[] str = reader.readLine().split("\\s");
                int[] arr = new int[n];
                for (int x = 0; x < n; x++) {
                    arr[x] = Integer.parseInt(str[x]);
                    max_till_here+=arr[x];
                    if(max_till_here<0)
                        max_till_here=0;
                    if(max_so_far<max_till_here)
                        max_so_far=max_till_here;

                    min_curr=Math.max(min_curr, arr[x]);
                }
                    if(max_so_far>0)
                System.out.println(max_so_far);
                    else
                        System.out.println(min_curr);
            }
        }
        catch(Exception ex)
        {

        }
    }

}
