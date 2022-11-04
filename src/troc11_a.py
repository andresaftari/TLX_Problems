x = 0
y = 0

movement = input()
for i in range(0, len(movement)):
    if movement[i].__eq__('R'):
        x += 1
    elif movement[i].__eq__('L'):
        x -= 1
    elif movement[i].__eq__('U'):
        y += 1
    elif movement[i].__eq__('D'):
        y -= 1

print(x, y)
