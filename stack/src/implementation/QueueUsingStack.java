package implementation;

import java.util.Stack;

public class QueueUsingStack {
public static void main (String [] args)
{
	QueueStack qst= new QueueStack();
	qst.Enqueue(1);
	qst.Enqueue(2);
	qst.Enqueue(3);
	qst.Enqueue(4);
	qst.Enqueue(5);
	qst.Enqueue(6);
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
	qst.Enqueue(4);
	qst.Enqueue(5);
	qst.Enqueue(6);
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
	qst.dequeue();
}

}

class QueueStack
{

	Stack<Integer> st1= new Stack<Integer>();
	Stack<Integer> st2= new Stack<Integer>();
	
	boolean isBothEmpty()
	{
		
		if(st1.isEmpty() && st2.isEmpty())
			return true;
		else
			return false;
	}
	
	public void Enqueue(int i)
	{
		
		st1.push(i);
		System.out.println("enqueued item " );
		
	}
	public void dequeue()
	{
		if(isBothEmpty()) {
			System.out.println("Queue is empty");
		return;
		}
		
		else
		{
		
			if(st2.isEmpty())
			{
				while(!st1.isEmpty())
				{
					st2.push(st1.pop());
				}
			}
			int x=st2.pop();
			System.out.println("Item Dequeued "+x);
			
		}
	}
	}