pass_length = int(input())
pass_value = str(input())

formatted = ''

for i in range(pass_length):
    if i > 0:
        if formatted[len(formatted) - 1] != pass_value[i]:
            formatted += pass_value[i]
    else:
        formatted += pass_value[i]
print(formatted)
