package stackSol;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String [] args)
    {

    }

}
class StackParan
{
    Stack<Character> st;
    StackParan ()
    {
        st= new Stack<Character>();
    }

    public String isBalanced (String exp)
    {
        String result =  "Not Balanced";
        char [] arr= exp.toCharArray();
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
            {
                st.push(arr[i]);
            }
            else  if(arr[i]==')' || arr[i]=='}' || arr[i]==']')
            {
                if(st.isEmpty())
                {
                    return  result;
                }
                char ch=st.pop();
                if(!isMatchingPair(ch, arr[i]))
                {
                    return result;
                }
            }
        }
        if(!st.isEmpty())
            return result;
        result="balanced";
        return result;
    }
   public boolean isMatchingPair(char x , char y)
   {
       if(x=='(' && y==')')
           return true;

       if(x=='{' && y=='}')
           return true;

       if(x=='[' && y==']')
           return true;
       return false;
   }


}
