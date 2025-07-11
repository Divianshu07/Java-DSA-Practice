public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target)
            return binarySearch(arr, mid + 1, high, target);
        else
            return binarySearch(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        System.out.println(result != -1 ? "Found at index: " + result : "Not found");
    }
}
