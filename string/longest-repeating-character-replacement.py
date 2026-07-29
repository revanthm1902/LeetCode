class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxLen=0
        for l in range(len(s)):
            c={}
            maxFreq=0
            for r in range(l,len(s)):
                c[s[r]]=c.get(s[r],0)+1
                maxFreq=max(maxFreq,c[s[r]])

                length=r-l+1
                if length-maxFreq<=k:
                    maxLen=max(maxLen,length)
        return maxLen