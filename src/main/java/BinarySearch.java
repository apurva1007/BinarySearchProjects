import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    public int findIndex(int[] array, int l, int key){

        Arrays.sort(array);

        int low = l;
        int high = array.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
//            System.out.println("mid:" + mid);
            if(array[mid] == key)
                return mid;
            else if(array[mid] < key){
                low = mid+1;
            }
            else if(array[mid] > key){
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // read the integers from a file
        In in = new In(args[0]);
        BinarySearch binarySearch = new BinarySearch();
        int[] array = in.readAllInts();
        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
//            System.out.println(key);
            if (binarySearch.findIndex(array, 0, key) == -1)
                StdOut.println(key);
        }
    }
}
