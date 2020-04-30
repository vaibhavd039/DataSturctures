package standard;

import java.util.Stack;

/*
 * The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive day
 *s just before the given day, 
 * for which the price of the stock on the current day
 *  is less than or equal to its price on the given day
 */
public class StockSpanProblem {

	public static void main(String [] args)
	{ int price[] = { 10, 4, 5, 90, 120, 80 }; 
		StockSpanStack st= new StockSpanStack();
		st.getStockSpan(price);
	}
}



class StockSpanStack
{
	Stack <Integer> st;
	StockSpanStack()
	{
		st= new Stack<Integer>();
	}
	
	
	public  void getStockSpan( int [] arr)
	{
		int len= arr.length;
		int [] s= new int[len];
		s[0]=1;
		st.push(0);
		for(int i=1;i<len;i++)
		{
			while(!st.isEmpty() && arr[st.peek()] <= arr[i])
			{
				st.pop();
			}
			s[i]=(st.isEmpty()?(i+1):(i-st.peek()));
			st.push(i);
		}
		
		
	   for(int x: s)
	   {
		   System.out.print(" "+x);
	   }
	}
	
}