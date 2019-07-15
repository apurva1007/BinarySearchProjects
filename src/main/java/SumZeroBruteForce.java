import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class SumZeroBruteForce {

    int count(int arr[]){
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                for (int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0)
                        //System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = 0");
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
