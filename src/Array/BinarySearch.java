package Array;

public class BinarySearch {

    public static int binarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            // Find the index of the middle element
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x is greater, ignore the left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore the right half
            else
                high = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 0, 7, 7));
    }
}
