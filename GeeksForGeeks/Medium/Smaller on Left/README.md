# Smaller on Left

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/smaller-on-left20360700/1?page=1&category=set&sortBy=submissions)

## Solved On
29 Jun 2026 at 09:31 pm

<h2><a href="https://www.geeksforgeeks.org/problems/smaller-on-left20360700/1?page=1&category=set&sortBy=submissions">Smaller on Left</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr</strong>[ ] of <strong>n</strong> positive integers,&nbsp;the task is to find the greatest element on the left of every element in the array which is strictly smaller than itself, if this element does not exist for an index print <strong>"-1".</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 5, arr[] = [2, 3, 4, 5, 1]
<strong>Output: </strong>-1 2 3 4 -1
<strong>Explanation:<br></strong>Greatest element on the left of 3 smaller 
than itself is 2, for 4 it is 3 and for 5 
it is 1. Since 2 is the first element and 
no element on its left is present, so it's 
greatest smaller element will be -1 and for 
1 no element smaller than itself is present 
on its left, so it's greatest smaller element 
is -1.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3, arr[] = [1, 2, 3] <strong>
Output: </strong>-1 1 2 </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>6</sup><br>1 ≤&nbsp;arr[i] ≤&nbsp;10<sup>8</sup></span></p>