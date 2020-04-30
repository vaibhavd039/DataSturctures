package standard;

import java.util.Stack;

public class PostfixtoPrefix {
	public static void main (String [] args)
	{
		PosttoPre st = new PosttoPre();
		 String post_exp = "ABC/-AK/L-*"; 
	        System.out.println("Prefix : " +st.posttoPrefix(post_exp)); 
	}
	
}

class PosttoPre
{
	Stack<String> st;
	PosttoPre()
	{
		st =  new Stack<String>();
	}
	public String posttoPrefix(String exp)
	{
		char [] arr= exp.toCharArray();
		for(int i =0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(Character.isLetterOrDigit(ch))
			{
				st.push(ch+"");
			}
			else
			{
				if(!st.isEmpty())
				{
					String op1= st.pop();
					String op2 = st.pop();
					String temp =ch+op2+op1;
					st.push(temp);
				}
			}
		}
		return st.peek();
	}
}
