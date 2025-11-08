class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int l, int h) {
        if (l < h) {
            int pi = partition(nums, l, h);
            quickSort(nums, l, pi - 1);
            quickSort(nums, pi + 1, h);
        }
    }

    public int partition(int[] nums, int l, int h) {
        int pi = nums[l];  // pivot
        int i = l + 1;
        int j = h;

        while (i <= j) {
            while (i <= h && nums[i] <= pi) i++;
            while (nums[j] > pi) j--;

            if (i < j) swap(nums, i, j);
            else break;
        }

        swap(nums, l, j);
        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
