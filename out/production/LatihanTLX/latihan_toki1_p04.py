nums = 0
a, b = input().split()

for i in a:
    x = int(i)

    for j in b:
        y = int(j)
        ans = x * y
        nums += ans

print(nums)
