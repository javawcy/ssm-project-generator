#!/bin/bash

echo '==========开始安装==========='


echo '请确保安装java8, maven并设置好环境变量'

read -r -p "环境准备好了吗? [Y/n] " envConfirm
case $envConfirm in
    [yY][eE][sS]|[yY])
		echo "Yes 继续执行"
		;;
    [nN][oO]|[nN])
		echo "No 终止执行"
		exit 1
       	;;
    *)
		echo "Invalid input... 终止执行"
		exit 1
		;;
esac

cd deps

mvn clean install

cd ..

mvn clean install

rm -rf $HOME/.lowg

work_path=$(pwd)

mkdir $HOME/.lowg
cp $work_path/bin/lowg.sh $HOME/.lowg/

echo '==========安装完成==========='
echo '添加环境变量：export PATH="$HOME/.lowg:$PATH" !'



