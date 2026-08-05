# Sort the Two Parts Sorted

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sort-the-half-sorted2157/1?page=1&category=Sorting)

## Solved On
05 Aug 2026 at 04:54 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sort-the-half-sorted2157/1?page=1&category=Sorting">Sort the Two Parts Sorted</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px;">Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array.<br><strong>Note</strong>: The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size n-k where 0 ≤ k ≤ n) , where n is the length of array .</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = {2 3 8 -1 7 10}
<strong>Output: </strong>[-1, 2, 3, 7, 8, 10] 
<strong>Explanation: </strong>{2 3 8} and {-1 7 10} are sorted in the original array. The overall sorted version is {-1 2 3 7 8 10}</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = {-4 6 9 -1 3}
<strong>Output: </strong>[-4, -1, 3, 6, 9]
<strong>Explanation: </strong>{-4 -1} and {3 6 9} are sorted in the original array. The overall sorted version is {-4 -1 3 6 9}</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6<br></sup>-10<sup>5</sup>≤ arr[i] ≤ 10<sup>5</sup></span></p>