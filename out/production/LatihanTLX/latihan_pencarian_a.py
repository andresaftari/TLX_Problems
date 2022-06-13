input_a, input_b = map(int, input().split())
listnum = []

for i in range(input_a):
    listnum.append(input())

if listnum.__contains__(str(input_b)):
    print(listnum.index(str(input_b)))
else:
    print(-1)
