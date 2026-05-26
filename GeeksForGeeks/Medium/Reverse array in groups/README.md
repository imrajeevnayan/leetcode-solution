# Reverse array in groups

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&category=Arrays&status=unsolved&sortBy=submissions)

## Solved On
26 May 2026 at 06:13 pm

<h2><a href="https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&category=Arrays&status=unsolved&sortBy=submissions">Reverse array in groups</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[] </strong>of positive integers. Reverse every sub-array group of size <strong>k.<br></strong></span><span style="font-size: 18px;"><strong><em>Note: </em></strong>If at any instance, the remaining elements are fewer than k, reverse all of them.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5], k = 3<br><strong>Output:</strong> [3, 2, 1, 5, 4]<strong>
Explanation: </strong>First group consists of elements 1, 2, 3. Second group consists of 4, 5.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [5, 6, 8, 9], k = 5<br><strong>Output: </strong>[9, 8, 6, 5]<br><strong>Explnation: </strong>Since k is greater than the number of remaining elements, the entire array is reversed.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size(), k ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>