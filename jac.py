import numpy as np 
import math 
from numpy import linalg as LA

def L1_norm(vec):
    print(LA.norm(vec,1))

def L2_norm(vec):
    print(LA.norm(vec))

def LI_norm(vec):
    print(LA.norm(vec, np.inf))
#Ax = b 
#A: square matrix = num rows = num colmns 
# x: n * 1 vector 
# b: n * 1 vector 
def jacobi_iterations(A, b, max_iters=1000, eps=1e-10):
    A_size = A.shape 
    b_size = b.shape 
    if A_size[0] != b_size[0]: 
        print('Error: the sizes of matrix and vector do NOT match')
        exit()

    iters = 0
    x = np.zeros(shape=(A_size[1],1))
    x_prev = np.zeros(shape=(A_size[1],1))
    # initialize as x_i = b_i / A_ii
    for row in range(A_size[1]):
        x[row][0] = b[row][0] / A[row][row]
        x_prev[row][0] = b[row][0] / A[row][row]
    
    #residual |Ax-b|
    res = np.linalg.norm(np.dot(A, x_prev) - b)
    while res >= eps and iters < max_iters: 
        for row in range(A_size[0]): 
            tmp = b[row][0]
            for col in range(A_size[1]): 
                if col != row: 
                    tmp -= A[row][col] * x_prev[col][0]
            x[row][0] = tmp / A[row][row]
        
        iters+=1
        res = np.linalg.norm(np.dot(A,x) - b)
        x_prev = x.copy()

    L1_norm(x)
    L2_norm(x)
    LI_norm(x)
    print('root: {}, res: {}'.format(x,res))
    print('iterations: {}'.format(iters))


A_mat = np.array([    [20.,-10.,0.],
                    [-10.,20.,-10.],
                    [0.,-10.,20.]])

b_vec = np.array([[1.],
                 [1.],
                 [1.]])

jacobi_iterations(A=A_mat,b=b_vec)

