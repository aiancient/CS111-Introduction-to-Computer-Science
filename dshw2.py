import math 

def func(x): 
    val = math.exp(math.cos(x) + math.cos(x*x)) + math.cos(x) - 1 
    return val
    
def bisection(f, a, b, max_iters, eps):
    if f(a) * f(b) >= eps:
        print('error: could not use bisection method!')
        exit()
    iters = 0
    c = 0.5 * (a+b)
    while abs(f(c)) >= eps: 
        if f(a) * f(c) < 0:
            a = a
            b = c 
            c = 0.5 * (a+b)
        elif f(c) * f(b) < 0:
            a = c
            b = b
            c = 0.5 * (a+b)
        iters += 1
        print(iters,':',round(c,ndigits=4))
        print('\n')
        
    print('{}: {}'.format(c,f(c)))
    print('iterations: {}'.format(iters))
    

bisection(f=func,a=0,b=1.5,max_iters=100,eps=1e-6)