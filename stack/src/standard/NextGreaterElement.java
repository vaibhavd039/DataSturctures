package standard;

import java.util.Stack;

public class NextGreaterElement {
public static void main(String [] arhs)
{ int arr[] = { 11, 13, 21, 3 }; 
int n = arr.length; 
	StackNextGreate st = new StackNextGreate();
	st.nextgreater(arr);
}
}


class StackNextGreate
{
	Stack<Integer> st;
	StackNextGreate()
	{
		st= new Stack<Integer>();
	}
	public void nextgreater(int [] arr)
	{
		st.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(!st.isEmpty())
			{
				int num=st.pop();

				while(num<arr[i])
				{
					System.out.println("next greater element for" +num+" is "+arr[i]);
					if(st.isEmpty())
					{
					break;
					}
					num=st.pop();
				}
				
				if(num>arr[i])
					st.push(num);
			}
			st.push(arr[i]);
			
		}
		while(!st.isEmpty())
		{
			System.out.println("next greater element for" +st.pop()+" is -1");
		}
	}
}