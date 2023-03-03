n = int(input())
outs = ''

for i in range(0, n):
    data = str(input())
    out = 0

    # print(data[i])
    for j in range(len(data) - 1, -1, -1):
        if data[j].__eq__('0'):
            out = j
            break
    
    for j in range(out, -1, -1):
        outs += data[j]
print(outs, '\n')
    