import numpy as np
import math
import matplotlib.pyplot as plt
# approximate cos(x) in [0, 2*pi]
def func(x_input):
    return x_input ** 2
n_dp = 12
n_int = n_dp - 1
x = np.zeros(shape=(n_dp, 1))
y = np.zeros(shape=(n_dp, 1))
# initialize x, y
delta_x =  / n_int
for i in range(n_dp):
    x[i] = delta_x * i
    y[i] = func(x[i])
# plt.plot(x, y)
# plt.savefig('cosx.png')
# Construct A
A_size = n_dp - 2
A_mat = np.zeros(shape=(A_size, A_size))
def in_range(a, amin, amax):
    return a >= amin and a <= amax
for i in range(A_size):
    A_mat[i][i] = 2. * (2* delta_x)
    if in_range(i-1, 0, A_size-1):
        A_mat[i][i-1] = delta_x
    if in_range(i+1, 0, A_size-1):
        A_mat[i][i+1] = delta_x
def H(i):
    return (y[i+1]-y[i])/delta_x
# Construct B
B = np.zeros(shape=(A_size, 1))
for i in range(A_size):
    B[i] = 6. *(H(i+1) - H(i))
# initialize z and solve for z
z = np.zeros(shape=(A_size, 1))
z = np.dot(np.linalg.inv(A_mat), B)
z_tmp = z.copy()
z = np.zeros(shape=(n_dp, 1))
# 1, 2, 3, ... , 19
for i in range(1, n_dp-1):
    z[i] = z_tmp[i-1]
z[0] = 0
z[n_dp-1] = 0
def S(i, x_input):
    cubic_term = z[i+1]/(6*delta_x)*((x_input-x[i])**3) - z[i]/(6.*delta_x)*((x_input-x[i+1])**3)
    other_term = (y[i+1]/delta_x-delta_x/6*z[i+1])*(x_input-x[i])-(y[i]/delta_x-delta_x/6*z[i])*(x_input-x[i+1])
    return cubic_term + other_term
# n_dp = 21
# n_dp - 2 = 19 -> i = {0, 1, 2, ..., 18}
# i + 1 = {1, 2, 3, ..., 19}
x_test = np.zeros(shape=(n_dp, 1))
y_test = np.zeros(shape=(n_dp, 1))
# n_int intervals: so S(n_dp-1)  does not exist!
for i in range(n_dp-1):
    y_test[i] = S(i, x[i])
y_test[n_dp-1] = S(n_dp-2, x[n_dp - 1])
plt.plot(x, y_test)
plt.savefig('test.png')