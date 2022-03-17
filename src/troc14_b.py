n, m = map(int, input().split())

w = ''
b = ''

for i in range(0, m):
    w += 'W'
    b += 'B'

for i in range(0, n):
    if i % 2 == 0:
        print(b)
    else:
        print(w)
