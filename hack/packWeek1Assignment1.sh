#!/usr/bin/env bash

mkdir -p out/week1
cp src/main/java/{HelloGoodbye.java,HelloWorld.java,RandomWord.java}  out/week1

sed -i 's/protected/private/g' out/week1/*

rm out/hello.zip
zip -j out/hello.zip out/week1/*
unzip -l out/hello.zip
