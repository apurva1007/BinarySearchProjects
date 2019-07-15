public class FindShortest {
    public static void main(String[] args) {
//        int[] array = {11, 12, 15, 18, 2, 5, 6, 8};
//        int[] array = {15, 22, 23, 28, 31, 38, 78, 5, 6, 8, 10, 12};
//        int[] array = {16, 15, 14, 13, 12, 11, 10, 8, 7, 6, 3, 2};
//        int[] array = {15, 18, 2, 3, 6, 12};
        int[] array = {2, 1};
        FindShortest fs = new FindShortest();
        int index = fs.find(array);
        System.out.println(index);
    }

    private int find(int[] array) {
        int size = array.length;
        int low = 0;
        int high = size - 1;


        while (low <= high) {
            if (array[low] < array[high])
                return low;

            int mid = (low + high) / 2;
            int next = (mid + 1) % size;
            int prev = (mid + size - 1) % size;

            if (array[mid] < array[prev] && array[mid] < array[next])
                return mid;
            else if (array[mid] > array[high])
                low = mid + 1;
            else if (array[mid] < array[high])
                high = mid - 1;
        }
        return -1;
    }
}
