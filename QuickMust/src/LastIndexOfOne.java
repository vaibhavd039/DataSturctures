import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastIndexOfOne {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
//                int  n= Integer.parseInt(reader.readLine());
                char [] str = reader.readLine().toCharArray();

               int  index=-1;
                for(int x =0;x<str.length;x++)
                {
                    if(Character.getNumericValue(str[x])==1)
                    index=x;

                }
                System.out.println( index);
            }
        }
        catch(Exception ex)
        {

        }
    }
}
