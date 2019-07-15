import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class SumZeroWithBinarySearch {

    BinarySearch bs = new BinarySearch();

    int count(int arr[]){
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                int partialSum = arr[i] + arr[j];
                if(bs.findIndex(arr, j+1,  -1 * partialSum) != -1){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args)  {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        SumZeroBruteForce sumCount = new SumZeroBruteForce();
        int count = sumCount.count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }
}
