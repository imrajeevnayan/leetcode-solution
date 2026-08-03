# Merge three sorted arrays

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/merge-three-sorted-arrays-1587115620/1?page=1&category=Arrays&difficulty=Medium&sortBy=accuracy)

## Solved On
03 Aug 2026 at 10:46 pm

<h2><a href="https://www.geeksforgeeks.org/problems/merge-three-sorted-arrays-1587115620/1?page=1&category=Arrays&difficulty=Medium&sortBy=accuracy">Merge three sorted arrays</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given three sorted arrays <strong>a[]</strong>, <strong>b[]</strong> and <strong>c[]</strong> of positive integers. The task is to merge them into a single array which must be sorted in increasing order.</span><br><br><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [1, 2, 3, 4], b[] = [1, 2, 3, 5] c[] = [1, 2, 3, 4, 5, 6]
<strong>Output</strong>: [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6]
<strong>Explanation</strong>: Merging these three sorted arrays, we get:[1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6]<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>:a[] = [1, 2], b[] = [2, 3, 4], c[] = [4, 5, 6, 7]
<strong>Output</strong>: [1, 2, 2, 3, 4, 4, 5, 6, 7]
<strong>Explanation</strong>: Merging three sorted arrays, we get:[1, 2, 2, 3, 4, 4, 5, 6, 7]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ a.size(),b.size() ,c.size() ≤ 10<sup>4</sup><br>1 ≤ a[i], b[i], c[i] ≤ 10<sup>5</sup></span></p>