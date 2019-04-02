/*Given an array of numbers, arrange them in a way that yields the largest value.
For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value.
And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4},
then the arrangement 998764543431 gives the largest value.*/

import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> arr = new Vector<>();
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);


    }

    static void printLargest(Vector<String> arr) {

        Collections.sort(arr, new Comparator<String>() {

            // A comparison function which is used by
            // sort() in printLargest()
            @Override
            public int compare(String X, String Y) {

                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X;

                // Now see which of the two formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

    }

}




