k = int(input())
c = input()
d = input()

# middle setup
if k % 2 != 0:
    middle = k // 2
else:
    middle = -1

# pattern setup
for x in range(k):
    num = ''
    for y in range(k):
        if (x == 0 or x == k - 1) or (y == 0 or y == k - 1):
            num += d
        elif x == middle and y == middle:
            num += '*'
        else:
            num += c
    print(num)
