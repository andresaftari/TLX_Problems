def __check__(n):
    if n > n // 2 + n // 3 + n // 4:
        return n
    else:
        return __check__(n // 2) + __check__(n // 3) + __check__(n // 4)


print(__check__(int(input())))
