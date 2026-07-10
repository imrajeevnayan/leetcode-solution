# Subarray Sum Divisible By K

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sub-array-sum-divisible-by-k2617/1)

## Solved On
10 Jul 2026 at 04:10 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sub-array-sum-divisible-by-k2617/1">Subarray Sum Divisible By K</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given an integer array <strong>arr[] </strong>and a value <strong>k</strong>. The task is to find the count of all sub-arrays whose <strong>sum</strong> is <strong>divisible by k.</strong></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [4, 5, 0, -2, -3, 1], k = 5
<strong>Output:</strong> 7
<strong>Explanation</strong>: There are 7 sub-arrays whose sum is divisible by k: [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3] and [-2, -3]
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 2, 2, 2, 2, 2], k = 2
<strong>Output:</strong> 21
<strong>Explanation</strong>: All subarray sums are divisible by 2
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-1, -3, 2], k = 5
<strong>Output:</strong> 0
<strong>Explanation</strong>: There is no such sub-array whose sum is divisible by k.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>4<br></sup></span><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">-10<sup>6</sup> ≤ arr[i]≤ 10<sup>6<br></sup></span></span><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><span style="font-size: 18.6667px;">1 ≤ k ≤ 10<sup>4</sup></span></span></span></p>