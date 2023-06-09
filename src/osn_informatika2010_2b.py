n = int(input())

c0 = int(n / 1000)
n = n - c0 * 1000
c1 = int(n / 500)
n = n - c1 * 500
c2 = int(n / 200)
n = n - c2 * 200
c3 = int(n / 100)
n = n - c3 * 100
c4 = int(n / 50)
n = n - c4 * 50
c5 = int(n / 20)
n = n - c5 * 20
c6 = int(n / 10)
n = n - c6 * 10
c7 = int(n / 5)
n = n - c7 * 5
c8 = int(n / 2)
n = n - c8 * 2
c9 = int(n / 1)
n = n - c9

if c0 != 0:
    print(1000, c0)
if c1 != 0:
    print(500, c1)
if c2 != 0:
    print(200, c2)
if c3 != 0:
    print(100, c3)
if c4 != 0:
    print(50, c4)
if c5 != 0:
    print(20, c5)
if c6 != 0:
    print(10, c6)
if c7 != 0:
    print(5, c7)
if c8 != 0:
    print(2, c8)
if c9 != 0:
    print(1, c9)
