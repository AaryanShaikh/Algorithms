n = int(input())

import numpy as np

x   = np.zeros((n))
y   = np.zeros((n))
p   = np.array([0, 0])
c00 = np.array([0, 0])
c22 = np.array([2, 2])

count0 = 0
count1 = 0
x0 = 0
y0 = 0
x1 = 0
y1 = 0

for i in range (n) :
	x[i], y[i] = [float(z) for z in input().split()]

for i in range (n) :
	p[0] = x[i]
	p[1] = y[i]
	d00 = np.sqrt(((c00-p)**2).sum())
	d22 = np.sqrt(((c22-p)**2).sum())
	if d22<d00 :
		x1 += x[i]
		y1 += y[i]
		count1 += 1
	else :
		x0 += x[i]
		y0 += y[i]
		count0 += 1

if count0 != 0 :
    x0 = round(x0 / count0, 2)
    y0 = round(y0 / count0, 2)
    print(np.array([x0, y0]))
else :
    print(None)

if count1 != 0 :
    x1 = round(x1 / count1, 2)
    y1 = round(y1 / count1, 2)
    print(np.array([x1, y1]))
else :
    print(None)
