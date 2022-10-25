array = [1, 2, 3, 4, 5]


def __factorial__(n):
    if n <= 1:
        return 1
    else:
        return n * __factorial__(n-1)


print(__factorial__(3))

# def __summary__(n):
#     if n <= 1:
#         return array[1]
#     else:
#         return __summary__(n - 1) + array[n]

# def __sum_array__(arr, n):
#     # n >= 1
#     i = 0
#     s = 0
#
#     while i < n:
#         s += arr[i]
#         i += 2
#         # print(s)
#
#     return s