public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 34};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
