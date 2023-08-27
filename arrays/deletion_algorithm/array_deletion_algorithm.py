class array_deletion_algorithm:
    def __init__(self,A,n,k,item):
        self.A = A
        self.n = n
        self.k = k
        self.item = item
    
    def delete_array(self):
        #use del function
        del self.A[self.k]   
    def display(self):
        print(self.A)
        
        
        
A = [1,2,3,4,5,6]
n = 6
k = 2
item = 8
del1 = array_deletion_algorithm(A,n,k,item)
print("Before deletion:")
del1.display()
del1.delete_array()
print("After deletion:")
del1.display()