# -*- coding: utf-8 -*-
 
def fibo_ate_pos(pos):
    valores = []
     
    valores.append(1)
    valores.append(2)
    valores.append(3)
     
    for i in range(3, pos):
        valores.append(valores[i-1] + valores[i-2])
     
    return valores
 
fibonaccis = fibo_ate_pos(1000)
 
while True:
    linha = map(int,raw_input().split())
    limite_inferior = linha[0]
    limite_superior = linha[1]
    if limite_inferior==limite_superior and limite_inferior==0:
        break
     
    counter = 0
    for f in fibonaccis:
        if(limite_inferior <= f and  limite_superior >= f):
            counter+=1
    print counter