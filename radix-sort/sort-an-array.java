import java.util.Random;
import java.util.Stack;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        iterativeQuickSort(nums);
        return nums;
    }

    private void iterativeQuickSort(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0], high = range[1];

            if (low < high) {
                int pivotIndex = randomizedPartition(arr, low, high);

                // Push larger subarray first to minimize stack depth
                if (pivotIndex - 1 - low > high - (pivotIndex + 1)) {
                    stack.push(new int[]{low, pivotIndex - 1});
                    stack.push(new int[]{pivotIndex + 1, high});
                } else {
                    stack.push(new int[]{pivotIndex + 1, high});
                    stack.push(new int[]{low, pivotIndex - 1});
                }
            }
        }
    }

    private int randomizedPartition(int[] arr, int low, int high) {
        int pivotIdx = rand.nextInt(high - low + 1) + low;
        swap(arr, pivotIdx, high);
        return partition(arr, low, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) swap(arr, ++i, j);
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
}
