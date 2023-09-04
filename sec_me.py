import math
# define the objective function 
def f_func(x):
    val = x + math.exp(x)
    #val= math.cos(x)
    return val

def dfdx_func(x):
    val = 1 + math.exp(x)
    #val = -math.sin(x) 
    return val

def secant_method(f,sp1,sp2,max_iters,eps=1e-6):
    # x_(k+1) = f(x_k,x_(k+1))
    x_prepre = sp1
    x_pre = sp2
    x_next = x_pre - (x_pre - x_prepre)/(f(x_pre) - f(x_prepre)) * f(x_pre)
    print(x_next)
    print(f(x_next))
    print('\n')

    iters = 0

    while abs(x_next - x_pre) >= eps and iters < max_iters:
        x_prepre = x_pre
        x_pre = x_next
        x_next = x_pre - (x_pre - x_prepre)/(f(x_pre) - f(x_prepre)) * f(x_pre)
        print(x_next)
        print(f(x_next))
        print('\n')

        iters+=1

    print('root: {}, f(root): {}'.format(x_next,f(x_next)))
    print('iterations: {}'.format(iters))

secant_method(f=f_func,sp1=-1,sp2=-1.1,max_iters=100)

