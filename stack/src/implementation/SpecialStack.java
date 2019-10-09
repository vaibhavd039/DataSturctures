package implementation;

import java.util.Stack;

/*
 * Design a Data Structure SpecialStack that supports 
 * all the stack operations like push(), pop(), isEmpty(), isFull() 
 * and an additional operation getMin() which should return minimum element
 *  from the SpecialStack. All these operations of SpecialStack must be O(1). 
 *  To implement SpecialStack, you should only use standard
 *  Stack data structure and no other data structure like arrays, list, .. etc.
 * */
public class SpecialStack {

	Stack <Integer> act = new Stack<Integer>();
	Stack <Integer> aux = new Stack<Integer>();
	
	public void push(int x)
	{
		act.push(x);
		if(aux.isEmpty()) {
			aux.push(x);
			
			}
		else
		{
			int y=aux.peek();
			if(x<y)
				aux.push(x);
			else
			{
				aux.push(y);
			}
		}
	}
	public void pop()
	{
		if(act.isEmpty())
			System.out.println("Empty stack");
		else
		{
			System.out.println("popped "+act.pop());
			aux.pop();
		}
	}
	public void getMin()
	{
		if(!aux.isEmpty())
		System.out.println("min is "+aux.peek());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialStack st= new SpecialStack();
		st.push(4);
		st.push(2);
		st.push(3);
		
		st.push(5);
		st.push(6);
		st.push(10);
			st.pop();
			st.getMin();
			st.pop();
			st.getMin();
			st.pop();
			st.getMin();
			st.pop();
			st.getMin();
			st.pop();
			st.getMin();
			st.pop();
			st.getMin();
	}

}
