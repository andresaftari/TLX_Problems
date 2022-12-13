marker = []
building = []


# Grid setup
def __pattern__(w, h):
    for i in range(h):
        num = input('')
        num = [int(data) for data in num]
        building.append(num)
    return


def __starter__(col, row):
    # Filtered
    for i in range(col):
        if sum(building[i]) == row:
            marker.append(i)

    # Marked
    for j in range(len(marker)):
        for k in range(row):
            building[marker[j]][k] = 0

    return


def __destroy__(col, row):
    cycle = marker[-1]

    for i in range(row):
        # Increment check
        while True:
            if cycle < 0:
                break
            else:
                if building[cycle][i] == 1:
                    inner_cycle = cycle

                    # Decrement check
                    while True:
                        if inner_cycle >= col - 1:
                            break
                        else:
                            if building[inner_cycle + 1][i] == 0:
                                building[inner_cycle][i], building[inner_cycle + 1][i] = building[inner_cycle + 1][i], \
                                                                                         building[inner_cycle][i]
                            elif building[inner_cycle + 1][i] == 1:
                                break
                            inner_cycle += 1
            cycle -= 1
        cycle = marker[-1]
    return


# Result grid
def __result__(w, h):
    for i in range(h):
        for j in range(w):
            print(building[i][j], end='')
        print()
    return


x, y = [int(x) for x in input("").split()]
__pattern__(y, x)

while True:
    __starter__(x, y)
    if len(marker) == 0:
        break
    else:
        __destroy__(x, y)
    marker = []

__result__(y, x)
