import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RearrangeArray {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                int  n= Integer.parseInt(reader.readLine());
//                int sum=0;
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =0;x<n;x++)
                {
                    arr[x]=Integer.parseInt(str[x]);

                }
                int x=0, y=n-1;
                if(n%2==0) {
                while (x < y) {
                    System.out.print(arr[y] + " ");
                    System.out.print(arr[x] + " ");
                    y--;
                    x++;
                }
            }
                if(n%2!=0) {
                    while (x < y-1) {
                        System.out.print(arr[y] + " ");
                        System.out.print(arr[x] + " ");
                        y--;
                        x++;
                    }
                    System.out.print(arr[x]+" ");
                }

//                System.out.println( getEquiliberium(sum,arr));
                System.out.println(" ");
            }

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());

        }
    }
}
