class Juice:
    def __init__(self, name, capacity):
        self.name = name
        self.capacity = capacity

    def __add__(self, other):
        return Juice("{x}&{y}".format(x=self.name, y=other.name), self.capacity + other.capacity)

    def __str__(self):
        return "{x} ({y}L)".format(x=self.name, y=self.capacity)


a = Juice('Orange', 1.5)
b = Juice('Apple', 2.0)

result = a + b
print(result)
