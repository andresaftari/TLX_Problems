import matplotlib.pyplot as plt
import numpy as npy
import math

from typing import Tuple, List

# known function
def f(x):
    return -2 * x**6 + 1.5 * x**4 + 10 * x + 2

# iterating function
def f_iteration(x0, tolerance = 0.01, max_iteration = 3) -> Tuple[float, List]:
    fixed_points = []
    error = 1
    i = 0
    xi = None

    while (error > tolerance and i < max_iteration):
        xi = f(x0)
        x0 = xi
        
        error = abs(x0 - xi)
        fixed_points.append(x0)

        i += 1

    print(fixed_points)
    return xi, fixed_points

# plot creation
def __plot__(plot_func, fp, x_start, fx):
    function_v = npy.vectorize(fx)

    s = npy.linspace(0, 2, 100)
    y = function_v(s)

    plt.plot(s, y)
    plt.plot(fp, function_v(fp), 'c1')
    plt.plot(x_start, f(x_start), 'c2')
    plt.plot(plot_func, f(plot_func), 'c3')

    plt.plot(s, s, 'k')
    plt.show()


if __name__ == '__main__':
    x_start = 1
    xf, xp = f_iteration(x_start)
    
    __plot__(xf, xp, x_start, f)
    