class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        mp={}
        for num in nums:
            mp[num]=mp.get(num,0)+1
        max_freq=max(mp.values())
        ans=sum(freq for freq in mp.values() if freq==max_freq)
        return ans