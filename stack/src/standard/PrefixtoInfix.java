package standard;

import java.util.Stack;

public class PrefixtoInfix {
	public static void main(String [] args)
	{
		PerfixtoInfix stack = new PerfixtoInfix();
		String result= stack.getPrefixtoinfix("*-A/BC-/AKL");
				System.out.println(result);
	}
}

class PerfixtoInfix
{
	Stack <String> st ;
	PerfixtoInfix()
	{
		st = new Stack<String>();
	}
	
	public String getPrefixtoinfix(String exp)
	{
		String result = new String();
		char [] arr= exp.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
		char ch = arr[i];
		
			if(Character.isLetterOrDigit(ch))
			{
			 st.push(""+ch);
			}
			else
			{
				String a=null,b=null;
				if(!st.isEmpty())
				{
					a=st.pop();
				}
				if(!st.isEmpty())
				{
					b=st.pop();
				}
				if(a!=null && b!=null)
				{
					String temp= a+ch+b;
					st.push(temp);
				}
				else
				{
					return "invalid exp";
				}
			}
		}
		
		return st.peek();
		
	}
	
}
