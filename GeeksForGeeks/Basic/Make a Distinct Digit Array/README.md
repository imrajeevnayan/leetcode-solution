# Make a Distinct Digit Array

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/make-a-distinct-digit-array2007/1?page=1&status=unsolved&sortBy=difficulty)

## Solved On
07 Jul 2026 at 09:33 pm

<h2><a href="https://www.geeksforgeeks.org/problems/make-a-distinct-digit-array2007/1?page=1&status=unsolved&sortBy=difficulty">Make a Distinct Digit Array</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of positive integers, find all the <strong>distinct digits</strong> that appear in the elements of the array. Return the digits in <strong>sorted</strong> order.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [131, 11, 48]
<strong>Output: </strong>[1, 3, 4, 8]
<strong>Explanation: </strong>1, 3, 4, and 8 are only distinct digits that can be extracted from the numbers of the array.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [111, 222, 333, 4444, 666]
<strong>Output: </strong>[1, 2, 3, 4, 6]
<strong>Explanation: </strong>1, 2, 3, 4, and 6 are only distinct digits that can be extracted from the numbers of the array.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&nbsp;<span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span>arr.size()&nbsp;<span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span>10<sup>5</sup><br><span style="font-size: 14pt;">1&nbsp;<span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span></span></span><span style="font-size: 14pt;">arr[i]&nbsp;<span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span>10<sup>9</sup></span></p>