import java.util.*;
public class KthSumContinuousSubarray {
    public static void main(String [] args)
    {
        int [] arr={ 10, -10, 20, -40 };
        int n=arr.length;

        int sum= getKthSum(arr,n,6);
        System.out.println(sum);

    }
    public static int getKthSum(int [ ] arr, int n,int k) {
        int[] sum = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 2; i < n + 1; i++) {
            sum[i] = sum[i - 1] + arr[i - 1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for (int i = 1; i < n+1; i++) {
            for (int j = i; j < n+1; j++) {
                int x = sum[j] - sum[i- 1];
                if (pq.size() < k)
                    pq.add(x);
                else {
                    if (pq.peek() < x) {
                        pq.poll();
                        pq.add(x);
                    }
                }
            }
        }
        return pq.poll();
    }

    }







