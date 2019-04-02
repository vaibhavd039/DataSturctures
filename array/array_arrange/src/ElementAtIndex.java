import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class ElementAtIndex {
    public static void main (String [] args)
    {
    Scanner sc = new Scanner(System.in);
    int [] arr = new int [10];
    for(int i =0;i<10;i++)
    {
        arr[i]=sc.nextInt();

    }
        rearrangeSwap(arr);

    for(int i: arr)
    {
        System.out.println(i);
    }

    }

    static void rearrangeHash(int [] arr)
    {
        Set<Integer> hs= new HashSet<Integer>();
                for(int i: arr)
                {
                    hs.add(i);
                }
                for(int i=0;i<arr.length;i++)
                {
                    if(hs.contains(i))
                    {
                        arr[i]=i;
                    }
                    else
                        arr[i]=-1;

                }

    }


    static void rearrangeSwap(int [] arr)
    {

       for(int i=0;i<arr.length;)
       {

           if(arr[i]>=0 && arr[i]!=i)
           {
               int temp= arr[arr[i]];
               arr[arr[i]]=arr[i];
               arr[i]=temp;
           }
           else
               i++;
       }
    }



}
