import java.util.PriorityQueue;

public class SortNearlySorted {
    public static void main (String [] args)
    {
        int arr[] = {1, 12, 4, 6, 7, 10};
        int n = arr.length;
//        insertionSort(arr, n);
        HeapfySortint(arr, n,2);

    }
    public static void insertionSort(int [] arr, int n)
    {
        int i,j,key;
        for( i =1;i<n;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }

        for( i =0;i<n;i++)
        {
          System.out.println(arr[i]);
        }


    }



    public static void HeapfySortint( int [] arr, int n, int k)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(k+1);
        for(int i =0;i<=k;i++)
        {
            pq.add(arr[i]);

        }
        int index=0;
        for(int i=k+1;i<n;i++)
        {
            arr[index]=(int)pq.poll();
             index++;
             pq.add(arr[i]);
        }
        while(pq.peek()!=null)
        {
            arr[index]=(int)pq.poll();
            index++;

        }
        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }


}
