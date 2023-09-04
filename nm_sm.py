import math
# define the objective function 
def f_func(x):
    val = x + math.exp(x)
    #val= math.cos(x) -x
    return val

def dfdx_func(x):
    val = 1 + math.exp(x)
    #val = -math.sin(x) -1
    return val

def newtons_method(f,dfdx,sp,max_iters,eps=1e-6):
    x_pre = sp
    x_next = x_pre - f(x_pre)/dfdx(x_pre)
    print(x_next)
    print(f(x_next))
    print('\n')
    iters = 0
    #error = |x_(K+1) - (x_k)| = |g(x_k) -x_k)

    while abs(x_next - x_pre) >= eps and iters < max_iters:
        x_pre = x_next
        x_next = x_pre - f(x_pre)/dfdx(x_pre)
        print(x_next)
        print(f(x_next))
        print('\n')
        iters +=1

    print('root: {}, f(root): {}'.format(x_next,f(x_next)))
    print('iterations: {}'.format(iters))

newtons_method(f=f_func,dfdx=dfdx_func,sp=-1,max_iters=10)