import numpy as np
class Stack:
    def __init__(self):
        self.top = -1
        self.maxlen = 10
        self.stack = np.zeros(self.maxlen,)
        
    def push(self,item):
        if(all(Stack)):
            return
        else:
            self.top +=1
            self.stack[self.top] = item
    
    
        