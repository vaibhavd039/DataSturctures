import java.util.*;

public class KthSmallersQueue {
    public static void main(String [] args)
    {
        int[][] arr = { {10, 20, 30, 40},
        {15, 25, 35, 45},
        {25, 29, 37, 48},
        {32, 33, 39, 50},
    };
        KthSmallestqueue(arr, 4,7);


    }

    public static void KthSmallestqueue(int [][] mat, int n, int k)
    {
 int count=0;
        PriorityQueue <Integer> pq= new PriorityQueue<Integer>(n*n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(count<k) {
                    pq.add(mat[i][j]);
                    count++;
                }
                if(count>=k)
                {
                    int x=pq.peek();
                    int y = mat[i][j];
                    if(x>y)
                    {
                        pq.poll();
                        pq.add(y);
                    }
                }
            }
        }

for(int x=0;x<k;x++)
            System.out.println(pq.poll());




    }



}
