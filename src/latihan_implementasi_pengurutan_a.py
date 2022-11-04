n = int(input())
arr = []

for i in range(n):
    arr.insert(i, int(input()))

arr.sort()
for i in range(len(arr)):
    print(arr[i])
