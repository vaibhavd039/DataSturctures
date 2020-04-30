package implementation;

import javafx.util.Pair;

public class CustomDataStructure {
	public static void main(String [] args)
	{
		CustomStack st= new CustomStack();
		st.push(5);
		st.getMin();
		st.push(4);
		st.getMin();
		st.push(12);
		st.getMin();
		st.push(2);
		st.getMin();
		st.push(3);
		st.getMin();
		st.push(1);
		st.getMin();
		st.pop();
		st.pop();
		st.getMin();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}
}

class CustomStack
{
	int count=0;
	int min;
	int [][] arr= new int[2][1000];
	
	public void push(int x)
	{
		if(count>=1000)
		{
			System.out.println("Stack overflow");
			return;
		}
		else
		{
			if(count==0) {
			arr[0][count]=x;
			arr[1][count]=x;
			count++;
			return;
			}
			else
			{
				// this will check the min element so far
				if(x<arr[1][count-1])
				{
					arr[0][count]=x;
					arr[1][count]=x;
				}
				else
				{
					arr[0][count]=x;
					arr[1][count]=arr[1][count-1];
				}
				count++;
			}
			
			
		}
	}
	public void pop()
	{
		if(count==0)
		{

			System.out.println("Stack underflow");
			return;
		}
		else
		{
			int x= arr[0][count];
			count--;
			System.out.println("Element Popped"+x);
			
		}
	}
	
	public void getMin()
	{
		if(count==0)
		{
			System.out.println("Stack underflow");
			return;
		}
		else
		{
			int x= arr[1][count];
		
			System.out.println("Element min so far "+x);
		}
	}
}
