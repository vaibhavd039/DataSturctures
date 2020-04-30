package linkedListSol;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NthFromEnd {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int i =0;i<t;i++)
            {
                NthList ll= new NthList();
                int [] sum_num = Arrays.stream( reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                int n =sum_num[0];
                int m =sum_num[1];
                String [] str = reader.readLine().split("\\s");
                int [] arr= new int [n];
                for(int x =n-1;x>=0;x--)
                {
                    ll.push(Integer.parseInt(str[x]));

                }
              System.out.println(ll.getNthNode(m));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}


class NthList extends LinkedList
{
    public int getNthNode(int m)
    {
        int data=-1;
        int i =1;
        Node nth=head;
        Node start =head;
        while(i<m && nth.next!=null )
        {
            i++;
            nth=nth.next;
        }
        if(i<m)
            return -1;
        while(nth.next!=null)
        {
            start=start.next;
            nth=nth.next;
        }

        return start.data;

    }
}
