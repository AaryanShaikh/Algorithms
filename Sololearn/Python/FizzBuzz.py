n = int(input())
for i in range(1,n):
    if (i%2==0):
        continue
    elif (i%3==0 and i%5==0):
        print("SoloLearn")
    elif (i%3==0):
        print("Solo")
    elif (i%5==0):
        print("Learn")
    else:
        print(i)