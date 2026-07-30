class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        res=[]
        for i in range(k):
            res.append(arr[i])
        return res