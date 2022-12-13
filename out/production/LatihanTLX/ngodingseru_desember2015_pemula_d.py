arr = [int(input()) for i in range(int(input()))]

pattern_p = []
pattern_n = []
pattern_z = []

# pattern setup
for i in arr:
    if i > 0:
        pattern_p.append(i)
    elif i < 0:
        pattern_n.append(i)
    else:
        pattern_z.append(i)

# pattern check
for i in (pattern_n + pattern_z + pattern_p):
    print(i)
