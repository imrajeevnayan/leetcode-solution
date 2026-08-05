# Triplet Family

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/triplet-family/1?page=1&category=Sorting)

## Solved On
05 Aug 2026 at 04:29 pm

<h2><a href="https://www.geeksforgeeks.org/problems/triplet-family/1?page=1&category=Sorting">Triplet Family</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of integers, check whether there exist three elements such that the sum of two elements is equal to the third element.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 2, 3, 4]<br><strong>Output: </strong>true<br></span><span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">The pair (2, 2) sums to 4.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [5, 4, 3]<br><strong>Output: </strong>false<br></span><span style="font-size: 18px;"><strong>Explanation: </strong>No triplets satisfy the condition.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [</span><span style="font-size: 18px;">0, 0, 1, 0, 0, 1</span><span style="font-size: 18px;">]<br><strong>Output: </strong>true<br></span><span style="font-size: 18px;"><strong>Explanation: </strong>The pair(0, 1) sums to 1.</span></pre>
<p>&nbsp;</p>
<p><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Constraints:<br></strong><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1 &lt;= arr.size() &lt;= 10</span><sup style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">3</sup><br style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">0 &lt;= arr[i]</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">&nbsp;&lt;= 10</span><sup style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">5</sup><br style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"></span></span></p>