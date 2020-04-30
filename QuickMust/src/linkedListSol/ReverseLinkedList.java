package linkedListSol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseLinkedList {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                ReverseList ll= new ReverseList();
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =n-1;x>=0;x--)
                {
                    ll.push(Integer.parseInt(str[x]));

                }
                ll.reverse(ll.head);
                ll.printList();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

class ReverseList extends  LinkedList
{
    Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

        return head;
    }


}



