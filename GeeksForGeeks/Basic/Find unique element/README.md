# Find unique element

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/find-unique-element2632/1?page=2&status=unsolved&sortBy=difficulty)

## Solved On
29 Jun 2026 at 09:59 pm

<h2><a href="https://www.geeksforgeeks.org/problems/find-unique-element2632/1?page=2&status=unsolved&sortBy=difficulty">Find unique element</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;">Given an array of elements occurring in multiples of <strong>k</strong>, except one element which doesn't occur in multiple of <strong>k</strong>. Return the unique element.</span></span></p>
<p><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Examples:</strong></span></span></p>
<pre><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Input: </strong>k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
<strong>Output: </strong>5
<strong>Explanation: </strong>Every element appears 3 times except 5.</span></span></pre>
<pre><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Input: </strong>k = 4, arr[] = [2, 2, 2, 10, 2]
<strong>Output: </strong>10
<strong>Explanation: </strong>Every element appears 4 times except 10.</span></span></pre>
<p><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Expected Time Complexity:</strong> O(n* log(arr[i]))<br><strong>Expected Auxiliary Space:</strong> O(log(arr[i]))</span></span></p>
<p><span style="font-size: 14pt;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Constraints:</strong><br>3&lt;= arr.size()&lt;=2*10<sup>5</sup><br>2&lt;= k&lt;=2*10<sup>5</sup><br>1&lt;= arr[i]&lt;=10<sup>9</sup></span></span></p>