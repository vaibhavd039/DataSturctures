package standard;

import java.util.Stack;
import java.lang.*;
public class BalanceParantheses {
	public static void main(String [] args) {
	ParanthesesStack st = new ParanthesesStack();
	System.out.println(st.isBalanced("[()]{{[()()]()}"));
	}
		
}

class ParanthesesStack
{
	Stack <Character> st;
	ParanthesesStack()
	{
		st= new Stack<Character>();
	}
	public String isBalanced(String exp)
	{
		String result=new String();
		result ="not balanced";
		char [] arr= exp.toCharArray();
		 for(int i =0;i<arr.length;i++)
		 {
			 if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[' )
			 {
				 st.push(arr[i]);
			 }
			 else if( arr[i]==')' || arr[i]=='}' || arr[i]==']' )
			 {
				 if(st.isEmpty())
					 return result;
				 char ch=st.pop();
				 	if(!isMatchingPair(ch,arr[i]))
				 	{
				 		return result;
				 	}
			 }
			 
		 }
		 
		 if(!st.isEmpty())
			   return result;
		return "Balanced";
	}
	public boolean isMatchingPair(char x, char y)
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