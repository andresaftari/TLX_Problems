num_a, num_b, num_c, num_n = map(int, input().split())

res = pow(num_a, pow(num_b, num_c), num_n)
print(res + 1)
