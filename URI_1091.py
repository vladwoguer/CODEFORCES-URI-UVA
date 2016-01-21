# -*- coding: utf-8 -*-
 
 
while True:
    a = int(raw_input())
 
    if a == 0: break
     
    if(a > 0):
        d1, d2 = map(int, raw_input().split())
        for i in range(a):
            x, y = map(int, raw_input().split())
            if(x == d1 or y == d2):
                print "divisa"
            elif(x < d1 and y < d2):
                print "SO"
            elif(x < d1 and y > d2):
                print "NO"
            elif(x > d1 and y < d2):
                print "SE"
            else:
                print "NE"