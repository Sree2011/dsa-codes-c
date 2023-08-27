class array_insert_algorithm:
    def __init__(self,A,n,k,item):
        self.A = A
        self.n = n
        self.k = k
        self.item = item
        
    def array_insert(self):
        #use insert function
        self.A.insert(self.k,self.item)
    
    def display(self):
      print(self.A)  
            
A = [1,2,3,4,5,6]
n = len(A)
k = 2
item = 9
ins1 = array_insert_algorithm(A,n,k,item)
ins1.array_insert()
ins1.display()