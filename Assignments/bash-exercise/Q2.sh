#!/bin/bash

#Fibonacci series up to 100
#Fibonacci = 1+1=2, 1+2=3, 2+3=5

N=13
a=0
b=1

for (( i=0; i<N; i++ ))  #
do
echo "$a"

   fd=$((a + b))
    a=$b
    b=$fd


done

