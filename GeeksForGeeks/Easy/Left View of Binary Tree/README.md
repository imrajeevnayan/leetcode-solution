# Left View of Binary Tree

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1?page=1&category=Tree)

## Solved On
10 Aug 2026 at 01:45 pm

<h2><a href="https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1?page=1&category=Tree">Left View of Binary Tree</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given the <strong>root </strong>of a binary tree. Return the left view of the binary tree. </span><span style="font-size: 14pt;">The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> If the tree is empty, return an empty list.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [1, 2, 3, 4, 5, N, N] <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700174/Web/Other/blobid0_1785586075.png" width="210" height="175"> <br><strong>Output:</strong>[1, 2, 4]<strong><br></strong><strong>Explanation: </strong>From the left side of the tree, only the nodes 1, 2, and 4 are visible.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700174/Web/Other/blobid1_1785586111.png" width="214" height="178"><br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [1, 2, 3, N, N, 4, N, N, 5, N, N]<strong><br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700174/Web/Other/blobid2_1785504482.png" width="190" height="234">
<strong>Output: </strong>[1, 2, 4, 5]<br><strong>Explanation: </strong>From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.<strong><br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700174/Web/Other/blobid11_1785504656.png" width="190" height="235"></strong></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>0 ≤ number of nodes ≤ 10<sup>5</sup><br>0 ≤ node -&gt; data ≤ 10<sup>5</sup></span></p>