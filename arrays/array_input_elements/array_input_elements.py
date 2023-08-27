import numpy as np

class array_input_elements:
    def __init__(self):
        self.A1 = np.array([])
        self.n = 2
        self.A2 = np.zeros((self.n,))
    
    def arr_input(self):
        print("taking input using map function:")
        print("Enter elements in a single line separated by spaces:")
        self.A1 = list(map(int, input().split())) 
         
        print("taking input using for loop:")
        print("Enter array length:")
        self.n = int(input())
        self.A2 = np.zeros((self.n,))  # Reinitialize A2 with the correct shape
        print("Enter elements in different lines:")
        for i in range(self.n):
            self.A2[i] = int(input()) 
    
    def display(self):
        print("Array using map function")
        print(self.A1)
        
        print("Array using for loop")
        print(self.A2)

arrinp = array_input_elements()
arrinp.arr_input()
arrinp.display()
