n, p = [int(x) for x in input().split()]
X = []
for i in range(n):
    X.append([float(x) for x in input().split()])

y = [float(x) for x in input().split()]

import numpy as np

X = np.array(X)
X = X.reshape((n, p))

y = np.array(y)

Xt = np.transpose(X)

multX = np.matmul(Xt,X)
multX1 = np.linalg.inv(multX)

multF = np.matmul(multX1,Xt)

mult = np.matmul(multF,y)
mult = np.round(mult,2)

print(mult)
