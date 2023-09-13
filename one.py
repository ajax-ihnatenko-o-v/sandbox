from itertools import zip_longest

l1 = range(5)
l2 = range(10)

for i1, i2 in zip_longest(l1, l2):
    print(i1, i2)

print(list(range(5)))
print(list(reversed(range(5))))
