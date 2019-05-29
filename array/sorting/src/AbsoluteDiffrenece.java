/*
*Given an array of n distinct elements and a number x,
* arrange array elements according to the absolute difference with x, i. e.,
* element having minimum difference comes first and so on.
Note : If two or more elements are at equal distance arrange
them in same sequence as in the given array.
* */

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class AbsoluteDiffrenece {
    public static void main (String [] args)
    {
        int arr[] = {10, 5, 3, 9, 2};
        int n = arr.length;
        int x=7;
        absolutediffsort(arr, n,x);
    }
    public static void sortwithdiff(int []arr, int n, int x)
    {
//        this method will give the output but will not maintain the order
        int i=0,j=0;
        Arrays.sort(arr);
        int pivot=0;
        for( i =0;i<n;i++){
            if(arr[i]<x)
                pivot++;

    }
        if(arr[pivot]==x)
            {
                System.out.println(arr[pivot]);

                 i=pivot-1;
                 j=pivot+1;
    }

        if(arr[pivot]!=x)
        {


             i=pivot;
             j=pivot+1;
        }
        int counter=0;

        while(i>=0 && j<n)
        {
            if( Math.abs(arr[i]-x) < Math.abs(arr[j]-x))
            {
                System.out.println(arr[i]);
                i--;
                counter++;

            }
            else
            {
                System.out.println(arr[j]);
                j++;
                counter++;

            }

        }

        while(counter<n) {
            if (i >= 0) {
                System.out.println(arr[i]);
                i--;
            }
            if (j < n) {
                System.out.println(arr[j]);
                j++;
            }
        }

    }

    public static void absolutediffsort(int [] arr, int n , int x)
    {
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        for(int i =0;i<n;i++)
            {
                int diff= Math.abs(arr[i]- x);
                if(m.containsKey(diff))
                {
                    ArrayList<Integer> al = m.get(diff);
                    al.add(arr[i]);
                    m.put(diff,al);

                }
                else
                {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    m.put(diff,al);
                }
    }
        int index=0;
        for (Map.Entry me : m.entrySet())
        {
            ArrayList <Integer> al= (ArrayList <Integer>)me.getValue();
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


    }



}



