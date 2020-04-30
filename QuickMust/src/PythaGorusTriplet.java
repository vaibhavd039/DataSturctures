    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.Arrays;

    public class PythaGorusTriplet {
        public static void main(String [] args)
        {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int  t= Integer.parseInt(reader.readLine());
                for(int i =0;i<t;i++)
                {
                    int  n= Integer.parseInt(reader.readLine());
                    String [] str = reader.readLine().split("\\s");
                    int [] arr= new int [n];
                    int [] msis= new int [n];
                    for(int x =0;x<n;x++)
                    {
                        arr[x]=Integer.parseInt(str[x]);



                    }
                    Arrays.sort(arr);

                    System.out.println( getPythaGorusTriplet(arr,n));
                }
            }
            catch(Exception ex)
            {

            }
        }

        public static String getPythaGorusTriplet(int [] arr, int n)
        {

            String result="No";
            for(int i=n-1;i>=0;i--)
            {
                int a=arr[i]*arr[i];
                int b=0;
                int c=i-1;
                while(b<c)
                {
                    int x=arr[b]*arr[b]+arr[c]*arr[c];
                    if(x==a)
                    {
                        return "Yes";
                    }
                    if(x<a)
                        b++;
                    if(x>a)
                        c--;

                }
            }
            return  result;
        }

    }
