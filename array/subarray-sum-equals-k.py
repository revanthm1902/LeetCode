class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

            count = 0
            curr_sum = 0
            seen = {0:1}

            for i in nums:
                curr_sum+=i
            
                if (curr_sum-k) in seen:
                    count+=seen[curr_sum-k]
                
                if curr_sum in seen:
                    seen[curr_sum]+=1

                else:
                    seen[curr_sum]=1
                    
            return count


       


