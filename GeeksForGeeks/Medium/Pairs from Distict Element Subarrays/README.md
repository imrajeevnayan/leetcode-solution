# Pairs from Distict Element Subarrays

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sub-array-pairs5530/1)

## Solved On
26 Aug 2026 at 11:33 am

<h2><a href="https://www.geeksforgeeks.org/problems/sub-array-pairs5530/1">Pairs from Distict Element Subarrays</a></h2><h3>Difficulty Level: Medium</h3><hr><p>Given an array arr[], count the total number of pairs that can be formed from all possible contiguous subarrays containing distinct numbers. A pair is defined by its original array indices (i, j) where i &lt; j. <br>If the same pair of indices appears in multiple valid subarrays, it is counted only once. The array contains non-negative numbers between 0 and n - 1, where n is the size of the array.</p>
<p><span style="font-size: 12pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input:</strong> arr[] = [1, 4, 2, 4, 3, 2]
<strong>Output:</strong> 8
<strong>Explanation:</strong> The subarrays with only distinct elements are [1, 4, 2], [2, 4, 3] and [4, 3, 2]. From these, following pairs can be formed (1, 4), (1, 2), (4, 2), (2, 4), (2, 3), (4, 3), (4, 2), (3, 2)</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>arr[] = [1, 2, 2, 3]
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are 2 pairs that can be formed from above array (1, 2), (2, 3)</span></pre>
<p><span style="font-size: 12pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>0 ≤ arr[i] &lt; arr.size()</span></p>