class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        n=len(matrix)
        rows=[set() for _ in range(n)]
        cols=[set() for _ in range(n)]

        for r in range(n):
            for c in range(n):
                val=matrix[r][c]
                if val in rows[r] or val in cols[c]:
                    return False
                rows[r].add(val)
                cols[c].add(val)
        return True
