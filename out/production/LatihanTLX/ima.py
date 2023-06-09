i, count, n = 0, 1, ''
arr = []

while n != '-':
    n = input()
    
    if n != '-':
        arr.append(n)
    i += 1

for x in range(0, len(arr)):
    print('Bulan ' + str(count) + ': ', arr[x])
    count += 1