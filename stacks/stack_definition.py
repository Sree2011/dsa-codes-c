import numpy as np
class Stack_python:
    def __init__(self):
        self.top = -1
        self.maxlen = 10
        self.stack = np.zeros(self.maxlen,)
        
    def push(self,item):
        if(all(self.stack)):
            return
        else:
            self.top +=1
            self.stack[self.top] = item

    def topele(self):
        return self.stack[self.top]
    
    def isEmpty(self):
        if(not all(self.stack)):
            return True
        else:
            return False

    def display(self):
        print("Stack is : ",end="")
        print(self.stack)
        
    def size(self):
        return len(self.stack)

d1 = Stack_python()
for i in range (1,11):
   d1.push(i)
print("Is stack empty:", d1.isEmpty())
d1.display()
print('Top element:', d1.topele(), 'Size of the stack', d1.size())