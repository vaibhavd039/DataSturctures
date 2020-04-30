import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class LargestNumber {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                int n = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

               List<String> arr= new LinkedList<String>();

                for(int i =0;i<n;i++)
                {
                    arr.add(str[i]);
                }

               largetNumber(arr, n);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void  largetNumber(List<String> arr, int n)
    {
        int result=0;

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY=X + Y;

                // then append X at the end of Y
                String YX=Y + X;

                // Now see which of the two formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1:1;

            }
            }
 );


        for(String st: arr)
        {
            System.out.print(st);
        }
        System.out.println("");
    }
}



