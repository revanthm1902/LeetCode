class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n=len(mat)
        total=0
        for i in range(n):
            total+=mat[i][i]
            total+=mat[i][n-1-i]
        if n%2!=0:
            mid_idx=n//2
            total-=mat[mid_idx][mid_idx]
        return total