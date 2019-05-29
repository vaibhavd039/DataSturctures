import java.util.*;
public class KthElement2DArray {
    public static void main(String [] args) {
        int [][] mat ={
            {
                10, 20, 30, 40
            },
            {
                15, 25, 35, 45
            },
            {
                25, 29, 37, 48
            },
            {
                32, 33, 39, 50
            },
        } ;

    }


//    public int Kthsmallest (int [][] arr, int n, int k)
//    {
//
//        if(k<=0 || k>n*n)
//            return -1;
//        HeapNode[] harr = new HeapNode [n];
//        for(int i=0;i<n;i++)
//        {
//            harr[i].val =  arr [0][i];
//            harr[i].i=0;
//            harr[i].j=i;
//
//
//        }
//        buildHeap(harr,n);
//        HeapNode hr;
//
//        for(int i=0;i<k;i++)
//        {
//            hr= harr[0];
//
//        }
//
//
//
//    }
//
//
//    public static void swap(HeapNode a , HeapNode b)
//    {
//        HeapNode temp;
//        temp=a;
//        a=b;
//        b=temp;
//    }
//
//    public  static void minHeapfy(HeapNode [] hrr,int i, int heap_size)
//    {
//        int l=i*2+1;
//        int r= i*2+2;
//        int smallest=i;
//        if(l<heap_size && hrr[l].val<hrr[i].val)
//        {
//            smallest=l;
//        }
//        if(r<heap_size && hrr[r].val<hrr[smallest].val)
//        {
//            smallest=r;
//        }
//        if(smallest!=i)
//        {
//            swap(hrr[smallest], hrr[i]);
//            minHeapfy(hrr,smallest,heap_size);
//        }
//
//
//
//
//    }
//    public static void buildHeap(HeapNode [] hrr, int n)
//    {
//        int i=(n-1)/2;
//        while(i>=0)
//        {
//            minHeapfy(hrr, i,n);
//            i--;
//        }
//
//    }
//
//
//
//
//

}
//
//
//class HeapNode
//{
//    int val , int i , int j;
//
//
//
//
//}

