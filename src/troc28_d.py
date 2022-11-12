n = 0
u = 0
a = []
b = []
x = []
dp = [[]]


def __solve__():
    n, u = map(int, input().split())

    for i in range(1, n + 1):
        a[i], b[i], x[i] = map(int, input().split())
    
    for i in range(0, u + 1):
        dp[0][i] = 0
        dp[1][i] = u

        for j in range(1, n + 1):
            if i < a[j]: 
                continue

            it = i - a[j] + b[j]

            if dp[0][i] < dp[0][it] + x[j]:
                dp[0][i] = dp[0][it] + x[j]
                dp[1][i] = dp[1][it] - i + it
            elif dp[0][i] == dp[0][it] + x[j]:
                 dp[1][i] = max(dp[1][i], dp[1][it] - i + id)

    print(dp[0][u], dp[1][u])

__solve__() 
