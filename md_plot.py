import math
# define the objective function 
import matplotlib.pyplot as plt
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
    print(sp)
    print(f(sp))
    print("\n \n")
    x_next = x_pre - f(x_pre)/dfdx(x_pre)
    print(x_next)
    print(f(x_next))
    print('\n')
    #iters = 0
    steps = []
    residual = []
    steps.append(0)
    residual.append(abs(f_func(sp)))

    iters = 1
    #error = |x_(K+1) - (x_k)| = |g(x_k) -x_k)

    while abs(x_next - x_pre) >= eps and iters < max_iters:
        x_pre = x_next
        x_next = x_pre - f(x_pre)/dfdx(x_pre)
        print(x_next)
        print(f(x_next))
        print('\n')

        steps.append(iters)
        residual.append(abs(f(x_next)))
        iters +=1

    plt.plot(steps,residual,label="line 1")
    print('root: {}, f(root): {}'.format(x_next,f(x_next)))
    print('iterations: {}'.format(iters))

newtons_method(f=f_func,dfdx=dfdx_func,sp=-1,max_iters=10)

def secant_method(f,sp1,sp2,max_iters,eps=1e-6):
    # x_(k+1) = f(x_k,x_(k+1))
    x_prepre = sp1
    x_pre = sp2
    print(sp1)
    print(f(sp1))
    print("\n \n")

    print(sp2)
    print(f(sp2))
    print("\n \n")
    x_next = x_pre - (x_pre - x_prepre)/(f(x_pre) - f(x_prepre)) * f(x_pre)
    print(x_next)
    print(f(x_next))
    print('\n')

    #iters = 0

    xaxis = []
    yaxis = []
    xaxis.append(0)
    yaxis.append(abs(f(sp1)))
    xaxis.append(1)
    yaxis.append(abs(f(sp2)))

    iters = 2
    while abs(x_next - x_pre) >= eps and iters < max_iters:
        x_prepre = x_pre
        x_pre = x_next
        x_next = x_pre - (x_pre - x_prepre)/(f(x_pre) - f(x_prepre)) * f(x_pre)
        print(x_next)
        print(f(x_next))
        print('\n')

        xaxis.append(iters)
        yaxis.append(abs(f(x_next)))
        iters+=1

    plt.plot(xaxis,yaxis,label="line 2")
    plt.show()
    print('root: {}, f(root): {}'.format(x_next,f(x_next)))
    print('iterations: {}'.format(iters))

secant_method(f=f_func,sp1=-1,sp2=-1.1,max_iters=100)