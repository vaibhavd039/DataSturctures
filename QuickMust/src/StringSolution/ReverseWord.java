package StringSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {

                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\.");
                for(int i =str.length-1;i>0;i--) {
                    System.out.print(str[i] + ".");
                }
               System.out.println(str[0]+"");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
