class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        mins=[]
        for time in timePoints:
            h,m=map(int,time.split(':'))
            mins.append(h*60+m)
        mins.sort()
        diff=float('inf')
        for i in range(1,len(mins)):
            diff=min(diff,mins[i]-mins[i-1])
        circ_diff=(1440-mins[-1])+mins[0]
        diff=min(diff,circ_diff)
        return diff