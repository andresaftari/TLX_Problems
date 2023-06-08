def __fact__(n):
    if n == 1:
        return 1
    else:
        return __fact__(n - 1) * n


print(__fact__(5))
