package basic;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=  new Stack<Integer>();
		stack_push(st);
System.out.println(st);
		stack_peek(st);
		stack_pop(st);
		System.out.println(st);
	}
	public static void stack_push (Stack<Integer> st)
	{
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
	}

	public static void stack_peek (Stack<Integer> st)
	{
	System.out.println(st.peek());
	}
	public static void stack_pop (Stack<Integer> st)
	{
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
	public static int search (Stack<Integer> st)
	{
		
		int place =-1;
		return -1;
	}
}
