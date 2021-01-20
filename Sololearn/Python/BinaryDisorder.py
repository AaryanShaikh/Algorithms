y_true = [int(x) for x in input().split()]
y_pred =  [int(x) for x in input().split()]

import numpy as np

y_true = np.array(y_true)
y_pred = np.array(y_pred)

long = len(y_true)
tp = 0
fp = 0
fn = 0
tn = 0

for i in range(long) :
    if y_pred[i] == 1 :
        if y_true[i] == 1 :
            tp += 1
            continue
        fp +=1
        continue
    if y_true[i] == 1 :
            fn += 1
            continue
    tn += 1

result = np.array([tp, fp, fn, tn], dtype = 'f')
result = result.reshape((2,2))

print(result)