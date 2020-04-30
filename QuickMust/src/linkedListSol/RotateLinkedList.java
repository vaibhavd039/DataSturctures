package linkedListSol;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateLinkedList {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                RotateList ll= new RotateList();
                int  n= Integer.parseInt(reader.readLine());
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =n-1;x>=0;x--)
                {
                    ll.push(Integer.parseInt(str[x]));

                }
                int  k= Integer.parseInt(reader.readLine());
                ll.Rotate(ll.head,k);
                ll.printList();

            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

class RotateList extends LinkedList
{
    public void Rotate(Node head,int k)
    {
        Node kth=head;

        for(int i=0;i<k-1;i++)
            kth=kth.next;
        Node current=kth;
        if (current == null)
            return;

        while(current.next!=null)
                current=current.next;
        current.next=head;
        head=kth.next;
        kth.next=null;



    }

}

