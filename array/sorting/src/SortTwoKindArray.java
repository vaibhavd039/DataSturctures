public class SortTwoKindArray {


   public  static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1};

        segregate0and1(arr, arr.length);
        for (int a : arr)
            System.out.print(a + " ");
    }
  static void segregate0and1(int [] arr, int n)
  {
      int zerpCounter=0;
      for(int i =0;i<n;i++)
      {
          if(arr[i]==0)
              zerpCounter++;
      }
      for(int i =0;i<zerpCounter;i++)
      {
          arr[i]=0;

      }
      for(int i =zerpCounter;i<n;i++)
      {
          arr[i]=1;
      }

  }


}
