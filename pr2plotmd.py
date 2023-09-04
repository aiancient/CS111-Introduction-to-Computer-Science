import numpy as np 
import math 
from numpy import linalg as LA
import matplotlib.pyplot as plt

def L2_norm(vec):
    return LA.norm(vec)

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
    stops = []
    ress = []
    stops.append(iters)
    ress.append(L2_norm(res))

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
        stops.append(iters)
        ress.append(L2_norm(res))
    plt.plot(stops,ress)
    


def sor_iterations(A, b, w, max_iters=1000, eps=1e-10):
    A_size = A.shape 
    b_size = b.shape 
    if A_size[0] != b_size[0]: 
        print('Error: the sizes of matrix and vector do NOT match')
        exit()

    iters = 0
    x = np.zeros(shape=(A_size[1],1))
    # initialize as x_i = b_i / A_ii
    for row in range(A_size[1]):
        x[row][0] = b[row][0] / A[row][row]
    
    #residual |Ax-b|
    res = np.linalg.norm(np.dot(A, x) - b)
    stops = []
    ress = []
    stops.append(iters)
    ress.append(L2_norm(res))

    while res >= eps and iters < max_iters: 
        for row in range(A_size[0]): 
            tmp = b[row][0]
            for col in range(A_size[1]): 
                if col != row: 
                    tmp -= A[row][col] * x[col][0]
            x[row][0] = ((1-w)* x[row])+(w*(tmp / A[row][row]))
        
        iters+=1
        res = np.linalg.norm(np.dot(A,x) - b)
        stops.append(iters)
        ress.append(L2_norm(res))
    plt.plot(stops,ress)



A_mat = np.zeros((1000,1000))
np.fill_diagonal(A_mat,40.)
rng = np.arange(999)
A_mat[rng, rng+1] = -10

A_mat[rng+1,rng] = -10

b_vec = np.full((1000,1),1.)

#print(A_mat)
#print(b_vec)

jacobi_iterations(A=A_mat,b=b_vec)
sor_iterations(A=A_mat, b=b_vec, w=1)
sor_iterations(A=A_mat, b=b_vec, w=1.1)
plt.show()