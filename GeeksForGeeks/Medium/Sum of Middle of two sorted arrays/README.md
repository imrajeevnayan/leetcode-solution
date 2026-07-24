# Sum of Middle of two sorted arrays

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1?page=3&category=Binary%20Search&sortBy=accuracy)

## Solved On
24 Jul 2026 at 06:04 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1?page=3&category=Binary%20Search&sortBy=accuracy">Sum of Middle of two sorted arrays</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given two sorted integer arrays <strong>arr1[]</strong> and <strong>arr2[] </strong>of the same size. Find the sum of the<strong> </strong>middle elements of two sorted arrays arr1 and arr2.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr1[] = [1, 2, 4, 6], arr2[] = [4, 5, 6, 9]
<strong>Output:</strong> 9
<strong>Explanation:</strong> The merged array looks like [1, 2, 4, <strong>4, 5,</strong> 6,<strong> </strong>6, 9,]. Sum of middle elements is 9 (4 + 5).
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr1[] = [1, 12, 15, 26, 38], arr2[] = [2, 13, 17, 30, 45]
<strong>Output:</strong> 32
<strong>Explanation:</strong> The merged array looks like [1, 2, 12, 13, <strong>15, 17,</strong> 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1&nbsp;<span style="font-size: 18px;">≤ </span>arr1.size() == arr2.size()&nbsp;<span style="font-size: 18px;">≤</span>&nbsp;10<sup>3</sup><br>1&nbsp;<span style="font-size: 18px;">≤ </span>arr1[i]&nbsp;<span style="font-size: 18px;">≤ </span>10<sup>6</sup><br>1&nbsp;<span style="font-size: 18px;">≤ </span>arr2[i]&nbsp;<span style="font-size: 18px;">≤ </span>10<sup>6</sup></span></p>