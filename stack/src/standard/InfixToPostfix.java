package standard;

import java.util.Stack;

public class InfixToPostfix {
public static void main(String [] args)
{
	InfixToPostFixStack stack = new InfixToPostFixStack();
	String result= stack.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
			System.out.println(result);
}

}

class InfixToPostFixStack
{

	Stack<Character> st;
	InfixToPostFixStack()
	{
		st = new Stack<Character>();
	}
	
	public String infixToPostfix(String exp)
	{
		String result= new String();
		char [] arr= exp.toCharArray();
		for(char x : arr)
		{
			if(Character.isLetterOrDigit(x))
			{
				result+=x;
			}
			else
			{
				if(x=='(')
				{
					st.push(x);
				}
				else if (x==')')
				{
					
					while(!st.isEmpty() && st.peek()!='(')
					{
						result +=st.pop();
					}
					if(!st.isEmpty() && st.peek()!='(')
						return "invalid";
					else
						st.pop();
				}
				else
			    { 
	                while (!st.isEmpty() && getPreceDence(x) <= getPreceDence(st.peek())){ 
	                    if(st.peek() == '(') 
	                        return "Invalid Expression"; 
	                    result += st.pop(); 
	             } 
	                st.push(x); 
	            } 
			}
		}
		   while (!st.isEmpty()){ 
	            if(st.peek() == '(') 
	                return "Invalid Expression"; 
	            result += st.pop(); 
	         } 
		   
		   return result;
	}
	
	public int getPreceDence(char x)
	{
		switch(x)
		{
		case '+':
		case '-':
			return 1;
			
		case '*':
		case '/':
			return 2;
		case '^':    
			return 3;
			
		}
		return -1;
	}
	
	
}
