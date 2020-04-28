#!/bin/bash

echo '=========准备项目初始化=========='

echo -n "输入package (com.lowdad.dev):"
read package

if [[ ! -n "$package" ]]
then
    echo "包名不可为空"
fi

echo -n "输入项目名 (demo):"
read projectName

if [[ ! -n "$projectName" ]]
then
    echo "项目名不可为空"
fi


echo '=========开始初始化==========='

mvn archetype:generate -Dpackage=$package -DgroupId=$package -DartifactId=$projectName -Dversion=0.0.1-SNAPSHOT -DarchetypeGroupId=com.lowdad.dev -DarchetypeArtifactId=generator -DarchetypeVersion=1.0-SNAPSHOT -X -DarchetypeCatalog=local -DinteractiveMode=false

echo '=========初始化完毕==========='

