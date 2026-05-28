# First 1 in a Sorted Binary Array

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1?page=1&category=Binary%20Search&sortBy=difficulty)

## Solved On
28 May 2026 at 05:15 pm

<h2><a href="https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1?page=1&category=Binary%20Search&sortBy=difficulty">First 1 in a Sorted Binary Array</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 14pt;">Given a sorted array <strong><span style="color: #000000;">arr</span></strong> consisting of <strong>0</strong>s and <strong>1</strong>s. The task is to find the index&nbsp;</span><span style="font-size: 14pt;">(0-based indexing)</span><span style="font-size: 14pt;"> of the first <strong>1</strong> in the given array. </span></p>
<p><span style="font-size: 14pt;"><strong>NOTE: </strong>If one is not present then, return -1.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input : </strong>arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
<strong>Output : </strong>6
<strong>Explanation: </strong>The index of first 1 in the array is 6.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input : </strong>arr[] = [0, 0, 0, 0]
<strong>Output :</strong> -1
<strong>Explanation: </strong>1's are not present in the array.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>0 ≤ arr[i] ≤ 1</span></p>