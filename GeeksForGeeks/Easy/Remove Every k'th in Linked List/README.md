# Remove Every k'th in Linked List

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/remove-every-kth-node/1?page=2&category=Linked%20List)

## Solved On
04 Aug 2026 at 04:31 pm

<h2><a href="https://www.geeksforgeeks.org/problems/remove-every-kth-node/1?page=2&category=Linked%20List">Remove Every k'th in Linked List</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 12pt;">Given a singly linked list <strong>head </strong>, your task is to remove every <strong>k<sup>th</sup></strong> node from the linked list.&nbsp;</span></p>
<p><span style="font-size: 12pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>head: 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7 -&gt; 8, k = 2<br><strong>Output:</strong> 1 -&gt; 3 -&gt; 5 -&gt; 7<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700297/Web/Other/blobid1_1725171560.png" width="400" height="110"><br><strong>Explanation:</strong> After removing every 2nd node of the linked list, the resultant linked list will be: 1 -&gt; 3 -&gt; 5 -&gt; 7.</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>head: 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7 -&gt; 8 -&gt; 9 -&gt; 10, k = 3<br><strong>Output:</strong> 1 -&gt; 2 -&gt; 4 -&gt; 5 -&gt; 7 -&gt; 8 -&gt; 10<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700297/Web/Other/blobid2_1725171567.png" width="400" height="110"><br><strong>Explanation:</strong> After removing every 3rd node of the linked list, the resultant linked list will be: 1 -&gt; 2 -&gt; 4 -&gt; 5 -&gt; 7 -&gt; 8 -&gt; 10.</span></pre>
<p><span style="font-size: 12pt;"><strong>Constraints:</strong><br>1 ≤ size of linked list ≤ 10<sup>6</sup><br>1 ≤ node-&gt;data ≤ 10<sup>6</sup><br>1 ≤ k ≤ size of linked list</span></p>