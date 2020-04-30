package implementation;

public class TwoStackInOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDoubleStack st= new ArrayDoubleStack(10);
		st.push1(1);
		st.push1(2);
		st.push1(3);
		st.push1(4);
		st.push1(5);
		st.push2(7);
		st.push2(9);
		st.push2(10);
		st.push2(11);
		st.push2(12);
		st.push2(11);
		st.push2(12);
		st.pop1();
		st.pop2();
		st.pop1();
		st.pop2();
		st.pop1();
		st.pop2();
		st.pop1();
		st.pop2();
		st.pop1();
		st.pop2();
		st.pop1();
		st.pop2();
	}

}

class ArrayDoubleStack 
{
	int top1;
	int top2;
	int []  arr;
	ArrayDoubleStack(int n)
	{
		top1=-1;
		top2=n;
		arr= new int[n];
	}
	boolean isNotFull()
	{
		if(top1<top2-1)
			return true;
		else
			return false;
	}
	public void push1(int x)
	{
		if(isNotFull())
		{	top1++;
			arr[top1]=x;
			System.out.println("pushed "+x);
		}
		
		
		
	}
	public void push2(int x)
	{
		if(isNotFull())
		{	top2--;
			arr[top1]=x;
					System.out.println("pushed "+x);
		}
		

		
	}
	public void pop1()
	{
		if(top1>=0)
		{
			int x=arr[top1--];
			System.out.println(x);
		}
	}
	
	public void pop2()
	{
		if(top2<arr.length)
		{
			int x=arr[top2++];
			System.out.println(x);
		}
	}
}