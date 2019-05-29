public class ShortestUnorderedSubarray {
    public static void main (String[] args) {

        int ar[] = new int[]{7, 9, 10, 8, 11};
        int n = ar.length;

        System.out.println(shortestUnsorted(ar,n));
    }
  public static int shortestUnsorted(int [] arr, int n)
  {
      int flag=0;
      int increasing_flag=0, decr_flag=0;
      if(arr[0]<arr[1])
          increasing_flag=1;
      else
          decr_flag=1;
      for(int i =1;i<n;i++)
      {
          if(arr[i]<arr[i-1] && increasing_flag==1)
          {

              flag=1;
          }

          if(arr[i]<arr[i-1] && decr_flag==1)
          {

              flag=1;
          }


      }
      if (flag==1)
      return 3;
      else
          return 0;
  }

}
