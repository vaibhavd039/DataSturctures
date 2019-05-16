/*
Given an array of integers where each element represents the max number
of steps that can be made forward from that element.
 Write a function to return the minimum number of jumps to
 reach the end of the array (starting from the first element).
 If an element is 0, then cannot move through that element.
 */

public class JumpToEnd {
    public static void main(String [] args)
    {
        int[] arr = {1, 3, 6, 1, 0, 9};
        int size = arr.length;
        System.out.println("Minimum number of" +
                " jumps to reach end is " +
                minJumps(arr, size));
    }
    public static int minJumps(int [] arr, int n)
    {
        int [] jumps = new int [n];
        int min;
        jumps[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]==0)
                jumps[i]=Integer.MAX_VALUE;
            else if (arr[i]>=n-i-1)
            {
                jumps[i]=1;
            }
            else
            {
                 min=Integer.MAX_VALUE;
                for(int j=i+1;j<n && j<=arr[i]+i;j++)
                {
                    if(min>jumps[j])
                    {
                        min=jumps[j];
                    }
                }
                if (min != Integer.MAX_VALUE)
                    jumps[i] = min + 1;
                else
                    jumps[i] = min; // or Integer.MAX_VALUE
            }

        }


        return jumps[0];

    }


}

