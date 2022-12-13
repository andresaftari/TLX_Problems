n, a, b = map(int, str(input()).split(' '))

def __div__(x, y):
    while y > 0:
        x, y = y, x % y
    return x


def __kpk__(x, y):
    return x * y / __div__(x, y)


res = __kpk__(a, b)
print(int(res // a + res // b))