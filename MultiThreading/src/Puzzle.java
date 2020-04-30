import java.util.Scanner;

public class Puzzle {

    public static void main(String [] args)
    {

        int N=3;
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateMatrix(arr, N);


    }

    public static void rotateMatrix(int [][] arr , int n)
    {
            for(int i =0;i<n;i++)
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println(" ");
            }
    }

    /*
    1 , 2,3
    4, 5, 6
    7 ,8 ,9
     */
    /*
    7 ,4, 1
    8,5, 2,
    9,6, 3
     */


}
