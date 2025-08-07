class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] A, int lo, int hi) {
        if (lo >= hi) return;

        int mid = lo + (hi - lo) / 2;
        int pivot = median(A[lo], A[mid], A[hi]);

        if (pivot == A[lo] && lo != hi) swap(A, lo, hi);
        else if (pivot == A[mid] && mid != hi) swap(A, mid, hi);

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
        if ((a >= b && a <= c) || (a <= b && a >= c)) return a;
        if ((b >= a && b <= c) || (b <= a && b >= c)) return b;
        return c;
    }

    private void swap(int[] A, int i, int j) {
        if (i == j) return;
        int t = A[i]; A[i] = A[j]; A[j] = t;
    }
}
