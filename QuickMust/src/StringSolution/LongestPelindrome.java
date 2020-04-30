package StringSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestPelindrome {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {

                String str = reader.readLine().trim();
                System.out.println();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void getLongestPelindrome(String str)
    {

    }


}
