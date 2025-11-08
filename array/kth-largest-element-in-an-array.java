import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        int targetIndex = nums.length - k; // kth largest = (n - k)th smalles
        while (left <= right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == targetIndex) {
                return nums[pivotIndex];
            } else if (pivotIndex < targetIndex) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1; // should never happen
    }
    public static int partition(int[] nums, int low, int high) {
        int pi = nums[low];
        int i = low+1;
        int j = high;
        while (i <= j) {
            while (i <= high && nums[i] <= pi) i++;
            while (nums[j] > pi) j--;
            if (i < j) swap(nums, i, j);
            else break;
        }
        swap(nums, j, low);
        return j;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
