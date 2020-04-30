package standard;

import java.util.Stack;

public class PostFixEval {
    public static void main(String [] args)
    {
        EvalPostStack  est= new EvalPostStack();
        System.out.println(  est.evalExp("231*+9-"));
    }

}

class EvalPostStack
{
    Stack<Integer> st;
    EvalPostStack()
    {
        st = new Stack<Integer>();
    }

    public int evalExp( String exp)
    {
        char [] arr= exp.toCharArray();
        for(int i =0;i<arr.length;i++)
        {
            if(Character.isLetterOrDigit( arr[i]))
            {
                   st.push( Integer.parseInt(arr[i]+""));
            }
            else
            {
                int x=0,y=0;
                if(!st.isEmpty())
                {
                    x=st.pop();
                }

                if(!st.isEmpty())
                {
                    y=st.pop();
                }
                switch (arr[i])
                {
                    case '+':
                        st.push(x+y);
                        break;

                    case '-':
                        st.push(y-x);
                        break;

                    case '*':
                        st.push(y*x);
                        break;

                    case '/':
                        st.push(y/x);
                        break;

                    case '%':
                        st.push(y%x);
                        break;

                }

            }
        }
 return st.peek();
    }

}
