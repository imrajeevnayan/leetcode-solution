# Count Only Repeated

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-only-repeated2047/1)

## Solved On
22 Aug 2026 at 08:41 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-only-repeated2047/1">Count Only Repeated</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;"><span style="font-size: 18px;">Given a sorted array <strong>arr[]</strong> of positive integers where the elements are <strong>consecutive</strong>, meaning the difference between adjacent distinct elements is exactly 1. In the array, exactly one element is repeated one or more times, while all other elements appear exactly once.</span></span></p>
<p><span style="font-size: 18px;">Find and return the repeated element and the number of times it occurs in the array. If no element is repeated, return [-1, -1].</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 3, 4]
<strong>Output: </strong>3 2<strong>
Explanation: </strong>In the given array, 3 is occuring two times.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 4, 5, 5]
<strong>Output: </strong>5 2<strong>
Explanation: </strong>In the given array, 5 is occuring two times.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3]
<strong>Output: </strong>-1 -1<strong>
Explanation: </strong>In the given array, there's no repeating element, and thus the output is -1 -1.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>7</sup><br>1 &lt;= arr[i] &lt;= arr.size()</span></p>