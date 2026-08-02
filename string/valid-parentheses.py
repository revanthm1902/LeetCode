class Solution:
    def isValid(self, s: str) -> bool:
        # while "()" in s or "{}" in s or "[]" in s:
        #     s=s.replace("()","")
        #     s=s.replace("{}","")
        #     s=s.replace("[]","")
        # return s==""

        st=[]
        closeToOpen={")":"(","}":"{","]":"["}

        for c in s:
            if c in closeToOpen:
                if st and st[-1]==closeToOpen[c]:
                    st.pop()
                else:
                    return False
            else:
                st.append(c)
        return True if not st else False