import java.util.Scanner;

public class RearranegeWithIndex {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

         int arr[] = new int[]{50, 40, 70, 60, 90};
         int index[] = new int[]{3,  0,  4,  1,  2};
//        arrengeMethodwihoutSpace(arr,index);
        arr=methodwithSpace(arr,index);
        System.out.println("after arrange");
        for(int i: arr)
        {
            System.out.print(i+"\t");
        }

    }
    public static  void arrengeMethodwihoutSpace(int [] arr, int [] index)
    {
        for(int i=0;i<arr.length;i++){
            while(i!=index[i])
            {
                int backupelement= arr[index[i]];
                int backupindex = index[index[i]];
                arr[index[i]]=arr[i];
                index[index[i]]=index[i];
                arr[i]=backupelement;
                index[i]=backupindex;
            }

        }

    }
    public static int [] methodwithSpace(int []ary, int [] index)
    {
        int []temp = new int [ary.length];
        for(int i =0;i<ary.length;i++)
        {
            temp[index[i]]=ary[i];
        }
        return temp;
    }


}
