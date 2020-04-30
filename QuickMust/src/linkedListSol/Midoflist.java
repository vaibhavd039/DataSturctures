package linkedListSol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Midoflist {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                LinkedList ll= new LinkedList();
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =n-1;x>=0;x--)
                {
                 ll.push(Integer.parseInt(str[x]));

                }
                ll.printMiddle();

            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

