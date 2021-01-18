w1, w2, b, x1, x2 = [float(x) for x in input().split()]

import math

y = 1 / ( 1 + math.exp(-( w1*x1 + w2*x2 + b )))

y = round( y, 4 )

print( y )