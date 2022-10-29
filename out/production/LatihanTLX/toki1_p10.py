n = int(input())

temp = n
koin = [1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]
pecahan = 0

for i in range(len(koin)):
    pecahan = temp // koin[i]
    temp %= koin[i]

    if pecahan != 0:
        print(koin[i], pecahan)
