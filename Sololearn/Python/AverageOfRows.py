n, p = [int(x) for x in input().split()]

import numpy as np

matrix = np.ones(shape = [n, p], dtype = 'f' )
result = np.ones(shape = [n], dtype = 'f' )

for i in range (n) :
     entrance = input()
     entrances = entrance.split()
     for j in range (p) :
        matrix[i,j] = float(entrances[j])
     result[i] = matrix[i,:].mean()

result = np.round(result,2)

print(result)