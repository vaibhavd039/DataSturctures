package standard;

import java.util.Stack;

public class PostFixtoInfix {
	public static void main(String [] args)
	{
		PostFixtoInfixStack stack = new PostFixtoInfixStack();
		String result= stack.getPosttoInfix("ab*c+");
				System.out.println(result);
	}
}
class PostFixtoInfixStack
{
	Stack<String> st;
	PostFixtoInfixStack(){
		st= new Stack<String>();
	}
	public String getPosttoInfix(String exp)
	{
		char [] arr= exp.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch= arr[i];
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
					String temp= b+ch+a;
					st.push(temp);
				}
				else
				{
					return "Invalid";
				}
				
			}
		}
		
		return st.peek();
	}
}

