import pandas as pd
import numpy as np
filename = input()
column_name = input()
a=pd.read_csv(filename)
b=a[column_name]
print(np.array(b))