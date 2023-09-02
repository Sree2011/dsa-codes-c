"""
 * this code defines an array using 
 * different methods in python language
 * 
 """

import numpy as np

class array_definition:
    def __init__(self):
        self.A1 = []
        self.A2 = []
    def arr_def(self):
        #defining an array using list
        self.A1 = [1,2,3,4]
        #defining array using numpy library
        self.A2 = np.array([2,4,6,8])
        
    def display(self):
        print("The array defined using elements:")
        print(self.A1)
        print("The array defined using numpy library:")
        print(self.A2)
    
arr1 = array_definition()
arr1.arr_def()
arr1.display()


    
