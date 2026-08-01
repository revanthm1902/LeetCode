class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        # res=[]
        # for i in range(len(nums)-k+1):
        #     res.append(max(nums[i:i+k]))
        # return res

        q = deque()  # Stores indices of elements in monotonically decreasing order
        res = []
        
        for r in range(len(nums)):
            # 1. Pop smaller elements from the back (maintaining decreasing order)
            while q and nums[q[-1]] < nums[r]:
                q.pop()
                
            q.append(r)
            
            # 2. Remove left out-of-bound index from the front
            if q[0] < r - k + 1:
                q.popleft()
                
            # 3. Append maximum to result once the first window of size k is formed
            if r >= k - 1:
                res.append(nums[q[0]])
                
        return res