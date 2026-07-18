# Delete without head pointer

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty=Medium&status=unsolved&sortBy=accuracy)

## Solved On
19 Jul 2026 at 12:01 am

<h2><a href="https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty=Medium&status=unsolved&sortBy=accuracy">Delete without head pointer</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given a node <strong>del_node </strong>of a singly linked list. <strong>Delete </strong>this node from the list without access to the head pointer.</span></p>
<p><span style="font-size: 18px;">After deletion:</span></p>
<ul>
<li><span style="font-size: 18px;">The number of nodes in the linked list should decrease by one.</span></li>
<li><span style="font-size: 18px;">The relative order of the remaining nodes should remain unchanged.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Note:</strong> It is guaranteed that del_node is not the last node of the linked list.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>Linked List = 1 -&gt; 2, del_node = 1<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927843/Web/Other/blobid0_1778588071.webp" width="240" height="80">
<strong>Output: </strong></span><span style="font-size: 18px;">2<strong>
Explanation: </strong>After deleting 1 from the linked list, we have remaining nodes as 2.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927843/Web/Other/blobid0_1778589061.webp" width="175" height="80"></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>Linked List = 10 -&gt; 20 -&gt; 4 -&gt; 30, del_node = 20<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927843/Web/Other/blobid1_1778588084.webp" width="359" height="80">
<strong>Output: </strong>10-&gt;4-&gt;30<strong>
Explanation: </strong>After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927843/Web/Other/blobid1_1778589124.webp" width="302" height="80"><br></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>2 ≤ number of nodes ≤ 10<sup>6&nbsp;</sup>&nbsp;<br>1 ≤ node-&gt;data ≤ 10<sup>6</sup><br></span></p>