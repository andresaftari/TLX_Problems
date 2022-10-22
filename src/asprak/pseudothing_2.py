def __power__(y, z):
    x = 1
    for j in range(1, z + 1):
        x = x * y

    return x


cek = int(input())


def kali(y, z):
    x = 0
    while y != 0:
        x = x + z
        y = y - 1

        print(x, y, z)

    return x


print(kali(cek, 3))
