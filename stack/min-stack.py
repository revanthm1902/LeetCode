class MinStack:

    def __init__(self):
        self.st=[]
        self.minst=[]

    def push(self, value: int) -> None:
        self.st.append(value)
        curmin=min(value,self.minst[-1] if self.minst else value)
        self.minst.append(curmin)

    def pop(self) -> None:
        self.st.pop()
        self.minst.pop()

    def top(self) -> int:
        return self.st[-1]

    def getMin(self) -> int:
        return self.minst[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()