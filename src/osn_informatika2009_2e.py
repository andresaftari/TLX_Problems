num_queue = []
arrs = []

input_size = int(input())

for i in range(input_size):
    commands = input().split()
    arrs.append(commands)

for x in arrs:
    if x.__getitem__(0) == 'push_front':
        num_queue.insert(0, x.__getitem__(1))
    elif x.__getitem__(0) == 'push_back':
        num_queue.append(x.__getitem__(1))
    elif x.__getitem__(0) == 'pop_front':
        num_queue.pop(0)
    elif x.__getitem__(0) == 'pop_back':
        num_queue.pop()

for ans in num_queue:
    print(ans)
