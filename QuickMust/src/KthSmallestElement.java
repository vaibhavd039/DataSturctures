import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String [] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  t= Integer.parseInt(reader.readLine());
            for(int x =0;x<t;x++)
            {
                int n = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));

                String [] str = reader.readLine().trim().replaceAll(" +"," ").split("\\s");

                int [] arr= new int [n];

                for(int i =0;i<n;i++)
                {
                    arr[i] = Integer.parseInt(str[i]);
                }
                int k = Integer.parseInt(reader.readLine().trim().replaceAll(" +"," "));


            System.out.println(    getKthSorted(arr,0,n-1,k));
            }
        }
        catch(Exception ex)
        {

        }
    }

    public static int getKthSorted(int [] arr, int l, int n , int k)
    {
        int result=0;
        Arrays.sort(arr);
        result=arr[k-1];
return result;

    }

//    public static int kthSmallest(int [] arr, int l, int r, int k)
//    {
//        if (k > 0 && k <= r - l + 1)
//        {
//            int pos = partition(arr, l, r);
//            if (pos-l == k-1)
//                return arr[pos];
//            if (pos-l > k-1)
//                return kthSmallest(arr, l, pos-1, k);
//            return kthSmallest(arr, pos+1, r, k-pos+l-1);
//        }
//
//        return Integer.MAX_VALUE;
//    }
//    public static int kthSmallestElement(int [] arr,int l, int r , int k)
//    {
//
//         if(k>0 && k<= r-l+1)
//        {
//            int pos = partition(arr, l ,r);
//            if(pos-1==k-1)
//            {
//                return arr[pos];
//            }
//            if(pos-1>k-1)
//                return kthSmallestElement(arr, l, pos-1,k);
//
//            return kthSmallestElement(arr, pos+1, r,k-pos+l-1);
//
//        }
//        return Integer.MAX_VALUE;
//    }
//    public static int partition(int[] arr, int l , int r)
//    {  int i=l;
//        int x=arr[r];
//        for(int j=l;j<r;j++)
//        {
//            if(arr[j]<=x)
//            {
//                int temp =arr[i];
//                 arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//            }
//        }
//        int temp = arr[i];
//        arr[i] = arr[r];
//        arr[r] = temp;
//        return  i;
//    }


}
