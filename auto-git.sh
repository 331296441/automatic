#!/bin/sh
set -e
echo "scriptsauto commit 开始"

# 同时同步github和gitee

# 不管是从github 还是gitee下载的，都删掉源重新添加
git remote remove origin || true
git remote add github git@github.com:331296441/automatic.git  || true
git remote add gitee git@gitee.com:qq331296441/automatic-platform.git || true
# git remote add origin git@gitee.com:qq331296441/automatic.git || true
git branch --set-upstream-to=gitee/master || true

# 获取当前脚本所在目录的绝对路径
SCRIPT=$(readlink -f "$0")
SCRIPT_DIR=$(dirname "$SCRIPT")
# SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"  # 使用了bash语法,在docker中不可用
echo "当前目录为:"${SCRIPT_DIR}
# 进入脚本所在目录
cd "$SCRIPT_DIR"

echo "检查远程是否有更新"
# 检查远程是否有更新
git remote update &> /dev/null
if [ -n "$(git status -uno | grep '您的分支落后')" ]; then
  echo "远程有更新,正在拉取代码..."
  git pull
elif [ -n "$(git status -uno | grep 'Your branch is behind')" ]; then
  echo "远程有更新,正在拉取代码..."
  git pull
else
  echo "远程无更新,跳过"
fi
HOST_NAME=$(hostname)
current_time=$(date "+%Y-%m-%d %H:%M:%S")
echo "当前时间为:$current_time"

echo "先修改文件,再检查提交,确保修改后实时提交"
# 对于代码，无需修改权限再提交
chmod -R 777 ./


cd "$SCRIPT_DIR"
echo "检查本地是否有更新"
if [ -n "$(git status -s)" ]; then
  echo "本地有更新,正在提交并推送代码..."
  git config --global add.all true
  git add .
  git add --all .
  if [ -n "${1}" ]; then
    git commit -m "脚本提交 by $HOST_NAME $current_time, 提交内容：${1}"
  else
    git commit -m "auto commit by $HOST_NAME $current_time"
  fi
  git push gitee
  git push github --force
else
  echo "本地没有更新,跳过"
fi



echo "脚本auto commit结束"
  
  
commit_id=$(git rev-parse HEAD)
commit_time=$(git log -1 --format=%cd --date=format:'%Y-%m-%d %H:%M:%S')
echo "当前 Git commit 编号:$commit_id" > Update.md
echo "提交时间:$commit_time" >> Update.md
echo "检查时间:$current_time"  >> Update.md

echo "scriptsauto commit-done"
