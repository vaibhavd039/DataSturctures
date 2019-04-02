import java.util.Scanner;

public class maxminorder {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        getmaxMinWithNospace(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }

    }
   public static int []  getmaxMin( int [] arr)
    {


        int l=0;
        int h = arr.length-1;
        int n= arr.length;
        int [] temp= new int [n];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(flag)
                temp[i]=arr[l++];
            else
                temp[i]=arr[h--];
            flag=!flag;



        }
        return temp;


    }

    public static void getmaxMinWithNospace(int[] arr)
    {
        int minindex=0;
        int maxindex=arr.length-1;
        int maxelement= arr[maxindex]+1;
        for(int i=0;i<arr.length;i++)
    {
//            odd index check
        if((i+1)%2==0)
        {
            arr[i]=arr[i]+(arr[minindex]%maxelement)*maxelement;
            minindex++;
        }
        else
        {
            arr[i]=arr[i]+(arr[maxindex]%maxelement)*maxelement;
            maxindex--;
        }


    }
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=arr[i]/maxelement;

        }


    }


}
