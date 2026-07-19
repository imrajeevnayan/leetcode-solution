# Anagrams in Linked List

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/find-anagrams-in-linked-list--170647/1?page=6&difficulty=Medium&status=unsolved&sortBy=accuracy)

## Solved On
19 Jul 2026 at 11:02 am

<h2><a href="https://www.geeksforgeeks.org/problems/find-anagrams-in-linked-list--170647/1?page=6&difficulty=Medium&status=unsolved&sortBy=accuracy">Anagrams in Linked List</a></h2><h3>Difficulty Level: Medium</h3><hr><p>Given the <strong>head </strong>of a character linked list and a string <strong>str</strong>, return all non-overlapping <strong>anagrams </strong>of str present in the linked list.</p>
<p>If multiple anagrams overlap, choose the leftmost one. Return an empty array if no anagram exists.</p>
<p><span style="font-size: 12pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input:</strong> head:<strong> </strong>a -&gt; b -&gt; c -&gt; a -&gt; d -&gt; b -&gt; c -&gt; a, str = bac<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928184/Web/Other/blobid0_1778752589.webp" width="486" height="61"><strong>
Output: </strong>[a -&gt; b -&gt; c, b -&gt; c -&gt; a]<strong>
Explanation: </strong>In the given linked list, there are three anagrams: 
<strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928184/Web/Other/blobid4_1778752771.webp" width="484" height="139"><br></strong><span style="color: #000000;">But in 1 and 2, a -&gt; b -&gt; c and b -&gt; c-&gt; a are ovelapping. So we take a -&gt; b -&gt; c as it comes first from left.So the output is: [a -&gt; b -&gt; c, b -&gt; c -&gt; a]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928184/Web/Other/blobid5_1778752837.webp" width="220" height="59"> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928184/Web/Other/blobid6_1778752858.webp" width="220" height="59"><br></span></span></pre>
<pre><span style="font-size: 12pt;"><strong><span style="color: #000000;">Input: </span></strong><span style="color: #000000;">Linked list:</span><strong><span style="color: #000000;"> </span></strong><span style="color: #000000;">a -&gt; b -&gt; d -&gt; c -&gt; a, str</span><span style="color: #000000;"> = bac<br></span><strong><span style="color: #000000;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928184/Web/Other/blobid7_1778752946.webp" width="322" height="59"> <br>Output: </span></strong><span style="color: #000000;">-1</span><strong> 
Explanation: </strong>There is no anagrams, so the output is -1</span></pre>
<p><span style="font-size: 12pt;"><strong>Constraints:</strong><br>1 ≤ size of linked list ≤ 10<sup>6</sup><sup><br></sup>'a'</span><span style="font-size: 12pt;"> ≤ node-&gt;data ≤ 'z'<sup><br></sup></span></p>