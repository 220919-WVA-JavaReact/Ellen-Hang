#!/bin/bash

#bash script that takes in 2 numbers and allows you to perform simple operations

echo "enter first number: "
read a
echo "enter second number: "
read b

echo "Enter choice: "
echo "1. add"
echo "2. substract"
echo "3. multiply"
echo "4. divide"
read ch


case $ch in
 1) sum=$((a+b))
   echo "sum=$sum";;
 2) sub=$((a-b))
   echo "sum=$sub";;
 3)multiply=$((a*b))
   echo "sum=$multiply";;
 4)divide=$((a/b))
   echo "sum=$divide";;


esac
