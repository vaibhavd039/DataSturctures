import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SprialMatrix {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                int [] num = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");
             int  count=0;
               int m =num[0];
                int n =num[1];
                int [][] arr= new int [m][n];
                for(int i =0;i<m;i++)
                {
                    for(int j=0;j<n;j++) {
                        arr[i][j] = Integer.parseInt(str[count]);
                        count++;
                    }
                }


                print(arr,0,0,m,n);
                System.out.println("");
            }
        }
        catch(Exception ex)
        {

        }
    }


    static void print(int arr[][], int i,
                      int j, int m, int n)
    {
        // If i or j lies outside the matrix
        if (i >= m || j >= n)
        {
            return;
        }

        // Print First Row
        for (int p = i; p < n; p++)
        {
            System.out.print(arr[i][p] + " ");
        }

        // Print Last Column
        for (int p = i + 1; p < m; p++)
        {
            System.out.print(arr[p][n - 1] + " ");
        }

        // Print Last Row, if Last and
        // First Row are not same
        if ((m - 1) != i)
        {
            for (int p = n - 2; p >= j; p--)
            {
                System.out.print(arr[m - 1][p] + " ");
            }
        }

        // Print First Column, if Last and
        // First Column are not same
        if ((n - 1) != j)
        {
            for (int p = m - 2; p > i; p--)
            {
                System.out.print(arr[p][j] + " ");
            }
        }
        print(arr, i + 1, j + 1, m - 1, n - 1);
    }
}
