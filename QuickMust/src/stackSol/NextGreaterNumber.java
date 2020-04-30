package stackSol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterNumber {
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

                StackNextGreate snt= new StackNextGreate();
                snt.nextGreaterElement(arr,n);
            }
        }
        catch(Exception ex)
        {

        }
    }
}
class StackNextGreate {
    Stack<Integer> st;

    StackNextGreate() {
        st = new Stack<Integer>();
    }
    public void nextGreaterElement(int [] arr, int n)
    {
        int [] ans = new int [n];
        for(int i =n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            ans[i]=st.isEmpty()?-1: st.peek();
            st.push(arr[i]);

        }
        for(int i =0;i<n;i++)
            System.out.print(ans[i]+" ");
        System.out.println("");
    }


}