import java.util.Arrays;

public class Heapsort {

    public static void heapSort(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // turn heap to a sorted list
        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, i, 0);
        }
    }

    // heap of size n rooted at i
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;

        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{8, 12, 5, 2, 25, -2, 0};
        System.out.println(Arrays.toString(a));
//        heapify(a);
        System.out.println(Arrays.toString(a));
    }
}
