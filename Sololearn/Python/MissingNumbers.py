import numpy as np

lst = [float(x) if x != 'nan' else np.NaN for x in input().split()]

import pandas as pd

lst = pd.Series(lst)

long = len(lst)

ave = 0
count = 0

for i in range (long) :
     if str(lst[i]) != 'nan' :
          ave += lst[i]
          count += 1

ave = ave / count

for i in range (long) :
     if str(lst[i]) == 'nan' :
          lst[i] = ave
         
lst = np.round(lst,1)

print(lst)