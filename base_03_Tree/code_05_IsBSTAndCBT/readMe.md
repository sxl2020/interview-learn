## 判断一棵树是否是搜索二叉树、判断一棵树是否是完全二叉树

| 时间 | 笔记 |
|---|---|
|2019.02.25|搜索二叉树与完全二叉树的定义|

**二叉搜索树 Search for Binary Tree ： BST**

二叉搜索树要求：每个节点都不比它左子树的任意元素小，而且不比它的右子树的任意元素大。

二叉搜索树可以方便的实现搜索算法：
在搜索元素x的时候，我们可以将x和根节点比较:
     1. 如果x等于根节点，那么找到x，停止搜索 (终止条件)
     2. 如果x小于根节点，那么搜索左子树
     3. 如果x大于根节点，那么搜索右子树
     
二叉搜索树所需要进行的操作次数最多与树的深度相等。n个节点的二叉搜索树的深度最多为n，最少为log(n)。

### 如何判断一棵树为“二叉搜索树”？

中序遍历该数，若所得的序列，是依次递增的，则该数为二叉搜索树。

### 完全二叉树 Complete Binary Tree 简称为CBT

### 如何判断一棵树为“完全二叉树”？

层次遍历二叉树（宽度优先遍历）
分情况讨论：
假设某一个树中的节点为X：
节点的情况，一共有四种状态。其中，有三种该状态下，需要做判断。

情况1 ：若节点X 有右孩子为无左孩子，则不是完全二叉树。

情况2： 若节点X有左孩子，无右孩子，或者两个孩子均为空。
        -- 则后续层次遍历的节点，必须都是叶子节点时，才是完全二叉树。
        否则，不是完全二叉树。
