class Solution:
    def check(self, nums: List[int]) -> bool:
        for num in nums:
            if nums[0]<=nums[1]:
                return True
        return False