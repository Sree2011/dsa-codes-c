class array_update_elements:
    def __init__(self, A1,k,item):
        self.A1 = A1
        self.k = k
        self.item = item
    def arr_update(self):
        self.A1[self.k] = self.item
        print("After update:")
        print(self.A1)
A1=[1,2,3,4,5]
k=1
item=4
print("Before update:")
print(A1)
aupdate = array_update_elements(A1,k,item)
aupdate.arr_update()
    
    