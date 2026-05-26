class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        rows=[set() for _ in range(3)]
        cols=[set() for _ in range(3)]

        for r in range(3):
            for c in range(3):
                val=matrix[r][c]
                if val in rows[r] or val in cols[c]:
                    return False
                rows[r].add(val)
                cols[c].add(val)
        return True
