n = int(input())

arr_a = []
arr_b = []
res = 0

for i in range(n):
    in_a = map(int, input().split())    
    arr_a.append(in_a)

for j in range(n):
    res += pow(arr_a[j], arr_b[j])

print(res)
