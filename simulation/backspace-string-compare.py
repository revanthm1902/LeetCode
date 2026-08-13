class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def build(x):
            st=[]
            for ch in x:
                if ch!="#":
                    st.append(ch)
                else:
                    st.pop()
            return "".join(st)
        return build(s)==build(t)