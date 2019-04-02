import java.util.Scanner;

public class CalcualteRotationINdexsum {
    static void reverse(int[] ary, int start, int end) {
        int temp;
        while (start < end) {
            temp = ary[start];
            ary[start] = ary[end - 1];
            ary[end - 1] = temp;
            start++;
            end--;
        }
    }
    static int  arraySum(int [] ary)
    {
    int sum=0;
    for(int i: ary)
    {
        sum+=i;
    }
    return sum;
    }
    static int  arrayindexproduct(int [] ary)
    {
        int sum=0;
        for(int i=0;i<ary.length;i++)
        {
            sum+=ary[i]*i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = i + 1;
        }
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        reverse(ary,0, d);
        reverse(ary,d, ary.length);
        reverse(ary,0,ary.length);
        for(int i :ary)
        {
            System.out.println(i);
        }
        int arysum=arraySum(ary);
        int currval=arrayindexproduct(ary);
        int max=currval;
        int n=ary.length;
        for(int i=1;i<ary.length;i++)
        {
            currval=currval+arysum-n*ary[n-i];
            if(currval>max)
                max=currval;
        }
        System.out.println(max);


    }
}
