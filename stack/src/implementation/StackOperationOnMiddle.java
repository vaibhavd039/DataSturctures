package implementation;

//1) push() which adds an element to the top of stack.
//2) pop() which removes an element from top of stack.
//3) findMiddle() which will return middle element of the stack.
//4) deleteMiddle() which will delete the middle element.
public class StackOperationOnMiddle {

	public static  void main(String [] args)
	{
		StackMiddle st= new StackMiddle();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.middle();
		st.pop();
	  st.middle();
	  st.pop();
	  st.middle();
	  st.deleteMiddle();
	  st.middle();
	}
}

class StackMiddle
{
	DoubleLinkedList top;
	DoubleLinkedList middle;
	int count;
	StackMiddle()
	{
		top=null;
		middle=null;
		 count=0;
	}
	
	public void push(int x)
	{
		DoubleLinkedList newdnode= new DoubleLinkedList(x);
		if(top==null)
			{
			top =newdnode;
			middle=newdnode;			
			count++;
			}
		else
		{
			newdnode.next=top;
			newdnode.prev=null;
			top.prev=newdnode;
			top=newdnode;
			count++;
			if(count%2!=0)
			{
				middle=middle.prev;
			}
			
		}
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("NO elements to be popped");
			return;
		}
		else
		{
			DoubleLinkedList node= top;
			DoubleLinkedList newtop= top.next;
			newtop.prev=null;
			top=newtop;
			System.out.println("Popped element"+node.data);
			
			count--;
			if(count%2==0)
			{
				middle=middle.next;
			}
		}
	}
	public void middle()
	{
		if(count==0)
		{
			System.out.println("No element");
		}
		else
		{
			int data = middle.data;
			System.out.println("Middle element"+data);
		}
	}
	public void deleteMiddle()
	{
		DoubleLinkedList middlenode= middle;
		System.out.println("middle element is "+ middlenode.data);
		DoubleLinkedList nextnode=middle.next;
		DoubleLinkedList prevnode =middle.next;
		nextnode.prev=prevnode;
		prevnode.next=nextnode;
		middle=prevnode;
		count--;
		if(count%2==0)
		{
			middle=nextnode;
					
		}
		
	}
}
class DoubleLinkedList
{
	DoubleLinkedList next;
	DoubleLinkedList prev;
	int data;
	DoubleLinkedList(int x)
	{
		data =x;
		next=null;
		prev=null;
	}
	
}
