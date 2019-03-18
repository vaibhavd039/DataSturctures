public class test {
    public static void main(String [] rags)
    {
        int [] ary= new int[10];
        for(int i =0;i<10;i++)
        {
            ary[i]=i+1;
        }

        for(int i :ary)
        {
            System.out.println(i);
        }
    }

}
