class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        res=[0]*n
        for i in range(n):
            p=1
            for j in range(n):
                if i==j:
                    continue
                p*=nums[j]
            res[i]=p
        return res