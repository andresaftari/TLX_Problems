x = input('')
n, m = x.split()

arr = []
movement = []
res = ''

lantai_ganjil = 0
lantai_genap = 0


for i in range(int(n)):
    res_a, res_b = input('').split()

    arr.append(int(res_a))
    movement.append(str(res_a) + str(res_b))


for i in range(1, int(n)):
    if arr[i] % 2 != arr[0] % 2:
        res = 'NO'
        break

if res == 'NO':
    print('NO')
elif len(set(movement)) > 2:
    print('NO')
else:
    print('YES')
