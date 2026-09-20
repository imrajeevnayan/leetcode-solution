# Distinct Pairs with Sum

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/all-distinct-pairs-with-given-sum/1)

## Solved On
20 Sept 2026 at 05:04 pm

<h2><a href="https://www.geeksforgeeks.org/problems/all-distinct-pairs-with-given-sum/1">Distinct Pairs with Sum</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given an array&nbsp;<strong>arr[]</strong>&nbsp;and an integer&nbsp;<strong>target</strong>.&nbsp;</span><span style="font-size: 18px;">You have to find all distinct pairs in array arr[]&nbsp;which sums up to given&nbsp;target<strong>.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Note:&nbsp;</strong></span></p>
<ol>
<li><span style="font-size: 18px;">(a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered same.</span></li>
<li><span style="font-size: 14pt;">Return the list of pairs sorted lexicographically by the first element, and then by the second element if necessary.</span></li>
</ol>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [1, 5, 7, -1, 5], target = 6 </span><span style="font-size: 18px;">
<strong>Output: </strong>[[1, 5], [-1, 7]]<strong>
Explanation: </strong></span><span style="font-size: 18px;">Pairs with sum 6 are (1, 5) and (-1, 7). </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 1, 1, 1], target = 2 
<strong>Output: </strong>[[1, 1]]<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">Pairs with sum 2 are (1, 1).</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [10, 12, 10, 15, -1],</span><span style="font-size: 18px;"> target = 125</span><span style="font-size: 18px;">
<strong>Output: </strong>[]</span></pre>