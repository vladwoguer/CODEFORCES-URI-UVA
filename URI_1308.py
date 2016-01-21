# -*- coding: utf-8 -*-
 
import math
def baskara(a, b, c):
    x=[]
    delta = b**2 - 4*a*c
    x.insert(1, ((-b + math.sqrt(delta))/(2*a)))
    x.insert(2, ((-b - math.sqrt(delta))/(2*a)))
    if(x[0] >= x[1]):
        return x[0]
    else:
        return x[1]
 
 
k = input()
for i in range(k):
    z = input()
    print int(baskara(1,1,(-2)*z))