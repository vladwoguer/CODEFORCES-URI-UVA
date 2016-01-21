# -*- coding: utf-8 -*-
 
def fibo_ate_pos(pos):
    if(pos==1):
        return 1
    if(pos==2):
        return 2
    if(pos==3):
        return 3
     
    anterior1 = 2
    anterior2 = 3
    atual=5
 
    for i in range(3, pos):
        atual=anterior1+anterior2
        anterior1=anterior2
        anterior2=atual
     
    return atual
     
     
while True:
    x=input()
    if x==0:
        break
    print(fibo_ate_pos(x))