res = 0
input_a, input_b = map(int, input().split())

while input_b >= input_a:
    res += 1
    input_b -= input_a

print(f'{res} {input_b}')
