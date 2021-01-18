def concatenate(*args):
    print(args[0],end="")
    for i in range(len(args)):
        if i == 0:
            continue
        else:
            print(f"-{args[i]}",end="")

concatenate("I","love","Python","!")