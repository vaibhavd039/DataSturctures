package basic;

public class StackByLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack st = new LinkedStack();
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
	

}
}


class LinkedStack
{

	StackNode root;
	
	static class StackNode
	{
		int data;
		StackNode next;
		   StackNode(int data) 
	        { 
	            this.data = data; 
	            this.next=null;
	        } 
	}
	
boolean isEmpty()
{

	if(root==null)
		return true;
	else
		return false;
}

public void push(int i )
{
	StackNode newnode = new StackNode(i);

	if(isEmpty()) {
		root=newnode;
		newnode.next=null;
		}
	else
	{
//		StackNode temp= root;
//		root=root.next;
		newnode.next=root;
		root=newnode;
		
	}
	
}
public int pop()
{
	
	if(root==null)
		return -1;
	else
	{
		int x= root.data;
		root=root.next;
		System.out.println(x);
		return x;
	}
}

}
