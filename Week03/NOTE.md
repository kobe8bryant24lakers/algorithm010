# 算法训练营第三周总结
## 学习思路
1. 每周学习流程：先看课件 --> 看课程内容讲解视频 --> 做预习题目 --> 看实战视频 --> 过全部题目（第一遍：5~10分钟思考，能做自己做，不能做看高票解答，理解或背诵；第二遍：自己敲一遍；第三遍：第二天；第四遍：一周后；第五遍：恢复练题） --> 提交周作业
2. 优化的时候，空间换时间；
3. 解题懵逼的时候，考虑：暴力？基本情况，归纳法？找最近重复子问题。
4. 递归类问题解决时，切忌人肉递归，主要考虑当前层解决办法，充分利用数学归纳法，查找最近重复子问题。

## git使用技巧
1. git add . 提交当前目录
2. git commit -m "提交说明" 提交变更
3. git push -u origin master 提交到远程仓库

## 学习内容回顾
>1. 树的递归模板：
	a. terminator 终止处理
	b. process current level logic 处理当前层逻辑
	c. drill down 递归下一层
	d. revert current level states 清除当前层状态
>2. 分治代码模板
	a. terminator 终止处理
	b. prepare data: divide rootproblem into subproblems 准备数据：将复杂问题拆分成子问题
	c. conqure subproblems: drill down 解决子问题：递归下一层
	d. merge subresult 合并子问题结果
	d. revert current level states 清除当前层状态
>3. 回溯（有待深入学习）