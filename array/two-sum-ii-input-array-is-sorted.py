class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # mp={}
        # for i,num in enumerate(numbers):
        #     rem=target-num
        #     if rem in mp:
        #         return [mp[rem]+1,i+1]
        #     mp[num]=i
        l,r=0,len(numbers)-1
        while l<r:
            cursum=numbers[l]+numbers[r]
            if cursum<target:
                l+=1
            elif cursum>target:
                r-=1
            else:
                return [l+1,r+1]
        return []