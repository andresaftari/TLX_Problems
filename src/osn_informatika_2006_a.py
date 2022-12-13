num = int(input())

# x = 1
count = 0
# for i i   n range(1, num + 1):
#     x *= i
#
# for i in range(0, len(str(x))):
#     if str(x).__getitem__(i).__eq__('0'):
#         count += 1
#
# print(count)

# count += num // 2
x = 5

while num >= x:
    count += num // x
    x = x * 5

print(count)
