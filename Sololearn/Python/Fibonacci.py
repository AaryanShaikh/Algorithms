num = int(input())


def fibonacci(n):
    num1 = 0
    num2 = 1
    print(num1)
    print(num2)
    for i in range(n - 2):
        res = num1 + num2
        print(res)
        num1 = num2
        num2 = res


fibonacci(num)