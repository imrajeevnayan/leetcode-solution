# Max Subarray Sum with Elements less than or equal to k

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/you-and-your-books/1?page=1&category=Dynamic%20Programming)

## Solved On
14 Aug 2026 at 11:20 pm

<h2><a href="https://www.geeksforgeeks.org/problems/you-and-your-books/1?page=1&category=Dynamic%20Programming">Max Subarray Sum with Elements less than or equal to k</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18.6667px;">Given an array <strong>arr[]</strong> and an integer <strong>k, </strong>the&nbsp;task is to find the <strong>maximum </strong>sum of a subarray such that every element in the chosen subarray is less than or equal to k.</span></p>
<p><span style="font-size: 18.6667px;"><strong>Note:</strong>&nbsp;A subarray is a contiguous sequence of elements within an array.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 1, arr[] = [3, 2, 2, 3, 1, 1, 1, 3]<br><strong>Output: </strong>3<br><strong>Explanation: </strong>Here, the valid subarray is [1, 1, 1], since all other elements are greater than 1. The sum of this subarray is 1 + 1 + 1 = 3, which is the maximum possible.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 2, arr[] = [3, 2, 2, 3, 1, 1, 1, 3]<br><strong>Output: </strong>4<br><strong>Explanation: </strong>Here, the valid subarrays are [2, 2] and [1, 1, 1]. Their sums are 4 and 3 respectively. Therefore, the maximum possible sum is 4, obtained from the subarray [2, 2].</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br style="font-size: 20px;"><span style="font-size: 14pt;">1 ≤ n ≤ 10<sup>5</sup></span><br style="font-size: 20px;"><span style="font-size: 14pt;">1 ≤ k ≤ 10<sup>4</sup></span><br style="font-size: 20px;"><span style="font-size: 14pt;">0 ≤ arr[i] ≤ 10<sup>4</sup></span></p>