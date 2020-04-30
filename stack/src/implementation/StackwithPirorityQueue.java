package implementation;

import java.util.PriorityQueue;

public class StackwithPirorityQueue {
	public static void main(String [] args)
	{
		StackWithLoad st= new StackWithLoad();
		st.push(5);
		st.push(4);
		st.push(12);
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

class Element implements Comparable<Element>
{
	int key;
	int value;
	Element(int key, int value)
	{
		this.key=key;
		this.value=value;
	}
	public int compareTo(Element b) {  
	    if(key<b.key){  
	        return 1;  
	    }else if(key>b.key){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
}
class StackWithLoad{
	PriorityQueue<Element> pq;
	int count;
	StackWithLoad()
	{
		pq= new PriorityQueue<Element>();
		count=0;
	}
	public void push(int x)
	{
		count++;
		Element element= new Element(count,x);
		pq.add(element);
	}
	public void pop()
	{
		if(count==0)
		{
			System.out.println("Empty Stack");
			return;
		}
		else
		{
			count--;
			Element el=	pq.poll();
		System.out.println("Element popped "+el.value);
		}
	}
	
}
