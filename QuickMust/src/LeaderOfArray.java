import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class LeaderOfArray {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");
                int [] arr= new int [n];
                for(int x =0;x<n;x++)
                {
                    arr[x]=Integer.parseInt(str[x]);
        }


               getLeaderOfArray(arr,n);
            }
        }
        catch(Exception ex)
        {

        }
    }
    public static   void  getLeaderOfArray(int [] arr, int n)
    {
        int  maxcurr=arr[n-1];
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=maxcurr)
            {
                maxcurr=arr[i];
                list.add(maxcurr);

            }
        }
       for(int i =list.size()-1;i>=0;i--)
        {

            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
    }

}
