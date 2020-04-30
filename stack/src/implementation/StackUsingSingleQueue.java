package implementation;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
public static void main(String [] args)
{
	StackSingleQueue st= new StackSingleQueue();
	st.push(5);
	st.push(4);
	st.push(3);
	st.push(2);
	st.push(1);
	st.push(0);
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	st.pop();
}
}
class StackSingleQueue
{
	Queue< Integer> queue;
	StackSingleQueue()
	{
		queue= new LinkedList<Integer>();
	}
	public void push(int x)
	{
		
		if(queue.size()==0) {
			queue.add(x);
		return;
		}
		else
		{
			queue.add(x);
			for(int i =0;i<queue.size()-1;i++)
			{
				int temp=queue.remove();
				queue.add(temp);
			}
		}
	}
	public void pop()
	{
		if(queue.size()==0)
		{
			System.out.println("Empty Stack");
		}
		else
		{
			int x= queue.remove();
			System.out.println("Popped Element "+x);
		}
		
	}
	
}