# Preorder traversal (Iterative)

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1?page=1&difficulty=Medium&status=unsolved&sortBy=accuracy)

## Solved On
30 Jul 2026 at 04:41 pm

<h2><a href="https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1?page=1&difficulty=Medium&status=unsolved&sortBy=accuracy">Preorder traversal (Iterative)</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given a Binary tree. Find the preorder traversal of the tree <strong>without using recursion</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Follow up:</strong> Try solving this with O(1) auxiliary space.</span></p>
<p><br><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1, 2, 3, 4, 5]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/912870/Web/Other/blobid0_1759488018.jpg" width="174" height="155"><br><strong>Output: </strong>[1, 2, 4, 5, 3]
<strong>Explanation:</strong>
Preorder traversal (Root-&gt;Left-&gt;Right) of
the tree is 1 2 4 5 3.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [8, 1, 5, N, 7, 10, 6, N, 10, 6]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/912870/Web/Other/blobid1_1759488047.jpg" width="214" height="191"><br><strong>Output: </strong>[8, 1, 7, 10, 5, 10, 6, 6]&nbsp;
<strong>Explanation:</strong>
Preorder traversal (Root-&gt;Left-&gt;Right) 
of the tree is 8 1 7 10 5 10 6 6.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ Number of nodes ≤ 10<sup>5</sup></span><br><span style="font-size: 18px;">0 ≤ node-&gt;data ≤ 10<sup>5</sup></span></p>