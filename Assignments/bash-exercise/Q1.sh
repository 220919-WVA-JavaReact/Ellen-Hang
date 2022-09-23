#!/bin/bash


# pattern half pyrmaid

a=0;
b=5; #five numbers 012345
c=6; #number of rows

for ((j=1; j<=$c; j++)) #to set the number of rows for the pyramid
do

 for ((i=1; i<=$j; i++)) 
  do
    echo -n "$a"; 
     a=$((a + 1));

done

a=0
echo
done

