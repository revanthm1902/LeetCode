class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
    public static void merge(int[] arr,int stIdx,int endIdx)
    {
        if(stIdx>=endIdx) return;
        int mid=(stIdx+endIdx)/2;
        merge(arr,stIdx,mid);
        merge(arr,mid+1,endIdx);
        mergeSort(arr,stIdx,mid,endIdx);
    }
    public static void mergeSort(int[] arr,int left,int mid,int high)
    {
        int[] temp=new int[high-left+1];
        int right=mid+1,idx=0;
        int start=left;
        while(left<=mid&&right<=high)
        {
            if(arr[left]>arr[right])
            {
                temp[idx++]=arr[right];
                right++;
            }
            else
            {
                temp[idx++]=arr[left];
                left++;
            }
        }
        while(left<=mid)
        {
            temp[idx++]=arr[left];
            left++;
        }
        while(right<=high)
        {
            temp[idx++]=arr[right];
            right++;
        }
        for (int m=0;m<temp.length;m++) {
            arr[start+m]=temp[m];
        }
    }
}