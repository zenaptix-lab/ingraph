#!/bin/bash

while read line; do
  IFS=' ' read -r -a array <<< $line
  filename=${array[0]}
  header=${array[1]}
  sed -i "1s/.*/$header/" $filename$POSTFIX
done < headers.txt
