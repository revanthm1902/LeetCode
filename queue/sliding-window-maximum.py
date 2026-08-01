class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res=[]
        w_sum=sum(nums[:k])

        for i in range(k,len(nums)):
            w_sum+=nums[i]
            w_sum-=nums[i-k]
            res.append(w_sum)
        return res