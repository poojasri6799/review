#!/bin/bash -x
read -p "enter number: " x
read -p "enter number: " y
echo z=$(($x+$y-$y))
echo z=$(($x-$y+$x))
echo z=$(($x/$y))
