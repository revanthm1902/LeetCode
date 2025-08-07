class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] A, int lo, int hi) {
        if (lo >= hi) return;
        // Median-of-three pivot: better chance at middle element
        int mid = lo + (hi - lo) / 2;
        int pivot = median(A[lo], A[mid], A[hi]);
        // Move pivot to end
        if (pivot == A[lo]) swap(A, lo, hi);
        else if (pivot == A[mid]) swap(A, mid, hi);

        // Three-way partition: < pivot | == pivot | > pivot
        int i = lo, lt = lo, gt = hi;
        while (i <= gt) {
            if (A[i] < pivot) swap(A, lt++, i++);
            else if (A[i] > pivot) swap(A, i, gt--);
            else i++;
        }

        quickSort(A, lo, lt - 1);
        quickSort(A, gt + 1, hi);
    }

    private int median(int a, int b, int c) {
        if ((a - b) * (c - a) >= 0) return a;
        if ((b - a) * (c - b) >= 0) return b;
        return c;
    }

    private void swap(int[] A, int i, int j) {
        int t = A[i]; A[i] = A[j]; A[j] = t;
    }
}
