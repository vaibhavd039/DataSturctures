import java.util.Scanner;

public class ArrayQues1 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr= new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        devideProblem(arr, 0,n);
    }

    public static void devideProblem(int [] arr, int l , int h)
    {
        if(arr.length==1)
        {
            System.out.println(arr[0]);
            return;
        }
        if(l<h)
        {
            int m =(l+h)/2;
            devideProblem(arr, l ,m);
            devideProblem(arr,m+1,h);
        }
    }

}
