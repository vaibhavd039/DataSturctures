package implementation;
////The problem is opposite of this post. We are given
//a Queue data structure that supports standard operations 
//like enqueue() and dequeue(). We need to implement a 
//Stack data structure using only instances of
//Queue and queue operations allowed on the instances.
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackQueue st= new StackQueue();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		
	}

}

class StackQueue
{
	Queue<Integer> q1= new LinkedList<Integer>(), q2= new LinkedList<Integer>();
	public void push(int x)
	{
		q1.add(x);
		System.out.println("pushed"+x);

	}
	
	public void pop()
	{
		System.out.println("size" + q1.size());
		if(q1.size()==0)
		{
			System.out.println("No Element popped ");
			return ;
			}
;
		while(q1.size()!=1)
		{
			q2.add(q1.remove());
			
		}
		int x=q1.remove();
		
		System.out.println(" Element popped "+x);
		Queue <Integer> temp=q1;
		q1=q2;
		q2=temp;
		
	}
}
