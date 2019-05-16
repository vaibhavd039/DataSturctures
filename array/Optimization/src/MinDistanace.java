/*
Given an unsorted array arr[] and two numbers x and y,
find the minimum distance between x and y in arr[].
The array might also contain duplicates. You may assume that
both x and y are different and present in arr[].

 */
class MinimumDistance
{
    int minDist(int arr[], int n, int x, int y)
    {

        int mindis=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int prev=0;
        for(int i =0;i<n;i++) {
            if (arr[i] == x || arr[i] == y) {
                start = i;
                start = end = i;
                prev = i;
                break;

            }
        }
            for(int i=prev+1;i<n;i++)
            {
                if((arr[i]==x || arr[i]==y) &&(arr[i]!=arr[prev]))
                {
                    if(i-prev<mindis) {
                        mindis = i - prev;
                        start = prev;
                        end = i;
                    }


                }
                if((arr[i]==x || arr[i]==y) && (arr[i]==arr[prev]))
                {

                    prev=i;

                }

            }
        return  mindis;
        }




    /* Driver program to test above functions */
    public static void main(String[] args) {
        MinimumDistance min = new MinimumDistance();
        int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int n = arr.length;
        int x = 3;
        int y = 6;

        System.out.println("Minimum distance between " + x + " and " + y
                + " is " + min.minDist(arr, n, x, y));
    }
}