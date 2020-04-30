package standard;

import java.util.Stack;

/*
Given a Prefix expression, convert it into a Postfix expression.
Conversion of Prefix expression directly to Postfix without going through
 the process of converting them first to Infix and then to Postfix is much better in
 terms of computation and better understanding the expression 
 (Computers evaluate using Postfix expression). * */

//

public class PrefixToPostfix {
public static void main (String [] args)
{
	PrefixtoPostFixStack st= new PrefixtoPostFixStack();
	 String pre_exp = "*-A/BC-/AKL"; 
	    System.out.println("Postfix : " + st.getPrefixtoPostFix(pre_exp)); 
}

}

class PrefixtoPostFixStack
{
   Stack<String> st ;
   PrefixtoPostFixStack()
   {
	   st= new Stack<String>();
   }
   
   public String getPrefixtoPostFix(String exp)
   {
	   
	   char [] arr= exp.toCharArray();
	   String result = new String();
	   for(int i=arr.length-1; i>=-0;i--)
	   {
		   char ch = arr[i];
		   if(Character.isLetterOrDigit(ch))
		   {
			   st.push(ch+"");
		   }
		   else
		   {
			   if(!st.isEmpty())
			   {
				   String op1= st.pop();
				   String op2=st.pop();
				   String temp =op1+op2+ch;
				   st.push(temp);
			   }
		   }
	   }
	   return st.peek();
   }
}