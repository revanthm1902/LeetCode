import java.util.Random;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            int pivotIndex = randomizedPartition(arr, low, high);

            // Recurse on smaller partition first to reduce stack depth
            if (pivotIndex - low < high - pivotIndex) {
                quickSort(arr, low, pivotIndex - 1);
                low = pivotIndex + 1;  // Tail call elimination
            } else {
                quickSort(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;  // Tail call elimination
            }
        }
    }

    private int randomizedPartition(int[] arr, int low, int high) {
        int pivotIdx = rand.nextInt(high - low + 1) + low;
        swap(arr, pivotIdx, high);
        return partition(arr, low, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) swap(arr, ++i, j);
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
}
