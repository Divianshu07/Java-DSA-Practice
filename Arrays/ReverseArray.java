// File: ReverseArray.java

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int start = 0, end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
