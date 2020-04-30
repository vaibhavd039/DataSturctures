package implementation;

public class MergebleStack {
public static void main(String [] args)
{
	Stack st1= new Stack();
	Stack st2= new Stack();
	
	
	st1.push(1);
	st1.push(2);
	st1.push(3);
	st1.push(4);
	st1.push(5);
	System.out.println("Stack 1");
	st1.printStack();
	st2.push(6);
	st2.push(7);
	st2.push(8);
	st2.push(9);
	st2.push(10);
	System.out.println("Stack 2");
	st2.printStack();
	st1=st1.mergeStacks(st1, st2);
	System.out.println("Merged Stack");
	st1.printStack();
			
}
}
class Stack {
	
	LinkedNode top;
	LinkedNode last;
	Stack()
	{
		top=null; last=null;
	}
	public void push(int x)
	{
		LinkedNode newnode = new LinkedNode(x);
		if(top==null)
		{
			top =newnode;
			last=newnode;
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("nothing to pop");
			return;
		}
		else
			
		{
			int x= top.data;
			top=top.next;
			if(top==null)
			{
				last=top;
			}
			System.out.println("popped element is "+x);
		}
	}
	public void printStack()
	{
		LinkedNode temp=top;
		if(temp==null)
		{
			System.out.println("Empty stack");
			return;
		}
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		while(temp!=null);
	}
	
	
	public Stack mergeStacks (Stack st1, Stack st2)
	{
		st1.last.next=st2.top;
		st1.last=st2.last;
		
		return st1;
	}
	
	
	
}

class LinkedNode
{
	int data;
	LinkedNode next;
	LinkedNode(int x)	
	{
		data =x;
		next=null;
	}
}