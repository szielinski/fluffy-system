public class Binarysearch {
    public static int binaryserach(int[] arr, int v) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (v < arr[mid]) right = mid - 1;
            else if (arr[mid] < v) left = mid + 1;
            else return mid;
        }
        return -1;
    }
}
