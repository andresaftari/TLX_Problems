n, m = map(int, input().split())
arr_n = [] 
arr_m = []
res = 0

for i in range(n):
    a = int(input())
    arr_n.append(a)

for j in range(m):
    b = int(input())
    arr_m.append(b)

duck = sorted(arr_n)
shoe = sorted(arr_m)

for x in duck:
    for y in shoe:
        if x == y or x + 1 == y:
            res += 1
            shoe.remove(y)
            break

print(res)