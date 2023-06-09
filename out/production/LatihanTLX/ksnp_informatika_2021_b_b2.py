from math import gcd

arr = map(int, input().split())
__list__ = list(arr)

a = __list__[0]
b = __list__[1]

__fpb__ = gcd(a, b)
print(int(__fpb__))
