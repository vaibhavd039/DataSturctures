package linkedListSol;

public class LinkedList {
    Node head;

    public void push( int data)
    {
        Node nd = new Node(data);
        nd.next=head;
        head=nd;

    }
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    void printMiddle()
    {
        Node slow=head;
        Node fast=head;
        if(head!=null)
        {
            while(fast!=null &&  fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.print(slow.data);
        }
    }




}
