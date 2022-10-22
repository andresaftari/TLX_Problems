def __calculation__(n):
    s = 0
    i = 1

    while i <= n:
        s = s + (i * i)
        i += 1

        # print('i = ', i)
        # print('s = ', s)

    return s


def __test_calculation__(x):
    res = (x / 6) * (x + 1) * (2 * x + 1)
    return res


if __name__ == '__main__':
    print('in trials: ', __test_calculation__(2))
    print('in pseudo: ', __calculation__(2))


