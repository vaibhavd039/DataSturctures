package basic;

public class StackByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
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


class Stack 
{
	static final int MAX=1000;
	int a [] = new int[MAX];
	int top;
	Stack()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		if(this.top<0)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(this.top>=MAX-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public void push(int i )
	{
		if(!this.isFull())
		{
			
			a[++top]=i;
			
		}
		else
		{
			System.out.println("Stack OverFlow");
		}
			
	}
	
	public void pop( )
	{
		if(!this.isEmpty())
		{
			
			int x=a[top--];
			System.out.println("Popped item "+x);
		}
		else
		{
			System.out.println("Stack Empty");
		}
			
	}
}
