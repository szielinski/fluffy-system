import java.util.Arrays;

public class Quicksort {

    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right) return;
        int partition = partition(arr, left, right);
        if (left < partition - 1) quicksort(arr, left, partition - 1);
        if (right > partition) quicksort(arr, partition, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = new int[]{8, 12, 5, 2, 25, -2, 0};
        System.out.println(Arrays.toString(a));
        quicksort(a);
        System.out.println(Arrays.toString(a));
    }
}
