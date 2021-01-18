class Juice:
    def _init_(self, name, capacity):
        self.name = name
        self.capacity = capacity

    def _add_(self, other):
        return Juice("{x}&{y}".format(x=self.name, y=other.name), self.capacity + other.capacity)

    def _str_(self):
        return "{x} ({y}L)".format(x=self.name, y=self.capacity)


a = Juice('Orange', 1.5)
b = Juice('Apple', 2.0)

result = a + b
print(result)