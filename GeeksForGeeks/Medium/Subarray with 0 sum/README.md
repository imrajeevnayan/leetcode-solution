# Subarray with 0 sum

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1)

## Solved On
10 Jul 2026 at 03:28 pm

<h2><a href="https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1">Subarray with 0 sum</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an array of integers, <strong>arr[]</strong>. Find if there is a <strong>subarray </strong>(of size at least one) with <strong>0 sum</strong>. Return true/false depending upon whether there is a subarray present with 0-sum or not.&nbsp;</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [4, 2, -3, 1, 6]
<strong>Output: </strong>true<strong>
Explanation: </strong>2, -3, 1 is the subarray with a sum of 0.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [4, 2, 0, 1, 6]
<strong>Output:</strong> true
<strong>Explanation:</strong> 0 is one of the element in the array so there exist a subarray with sum 0.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [1, 2, -1]
<strong>Output:</strong> false</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size &lt;= 10<sup>5</sup><br>-10<sup>5</sup> &lt;= arr[i] &lt;= 10<sup>5</sup></span></p>