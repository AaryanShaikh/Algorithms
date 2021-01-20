r = int(input()) 
lst = [float(x) for x in input().split()]

import numpy as np

arr = np.array(lst)

arr = arr.reshape((r,int(len(arr)/r)))

print(arr)
