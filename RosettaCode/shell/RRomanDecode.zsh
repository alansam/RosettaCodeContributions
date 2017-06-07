#!/bin/zsh

function parseroman () {
  local max=0 sum i j
  local -A conv
  conv=(I 1 V 5 X 10 L 50 C 100 D 500 M 1000)
  for j in ${(Oas::)1}; do
    i=conv[$j]
    if (( i >= max )); then
      (( sum+=i ))
      (( max=i ))
    else
      (( sum-=i ))
    fi
  done
  echo $sum
}

parseroman "IV"
parseroman "MCDXLIX"
parseroman "MCMXLIV"
parseroman "MCMLIV"
parseroman "MCMXC"
parseroman "MMVIII"
parseroman "MLXVI"
parseroman "MDCLXVI"
parseroman "MCMLXVI"
parseroman "MCMXCIX"
parseroman "MMXI"
parseroman "IIXX"

