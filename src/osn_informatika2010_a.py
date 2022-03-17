text_hello = 'halo dunia'
text_input = input()
counter = 0

for i in range(len(text_hello)):
    if text_input[i].lower() == text_hello[i]:
        counter += 1

print(counter)
