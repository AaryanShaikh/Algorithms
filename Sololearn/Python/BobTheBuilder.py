n = int(input())
X = []
for i in range(n):
    X.append([float(x) for x in input().split()])
y = [int(x) for x in input().split()]
datapoint = [float(x) for x in input().split()]

import pandas as pd
from sklearn.linear_model import LogisticRegression

model = LogisticRegression()
model.fit(X,y)

prevision = model.predict([datapoint])
print(int(prevision))