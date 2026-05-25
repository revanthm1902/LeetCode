class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        str_num="".join(map(str,digits))
        new_num=int(str_num)+1
        return [int(x) for x in str(new_num)]