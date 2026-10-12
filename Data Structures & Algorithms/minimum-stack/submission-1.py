class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        if(len(self.stack) == 0):
            self.stack.push(val)
            self.minStack.push(val)
        else:
            self.stack.push(val)
            if (val < self.minStack.peek()):
                self.minStack.push(val)
            else:
                self.minStack.push(minStack.peek())

    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()

    def top(self) -> int:
    
        return self.stack[-1]


    def getMin(self) -> int:
        return self.minStack[-1]
        
