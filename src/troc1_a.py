a, b, c = map(int, input().split())
res = ''

poin = 4 * (a + b + c) // 7
if poin == a or poin == b or poin == c:
    res = 'YA'
else:
    res = 'TIDAK'

print(res)