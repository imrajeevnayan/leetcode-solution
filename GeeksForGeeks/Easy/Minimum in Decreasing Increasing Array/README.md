# Minimum in Decreasing Increasing Array

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/ternary-search/1?page=1&category=Binary%20Search&sortBy=accuracy)

## Solved On
24 Jul 2026 at 05:55 pm

<h2><a href="https://www.geeksforgeeks.org/problems/ternary-search/1?page=1&category=Binary%20Search&sortBy=accuracy">Minimum in Decreasing Increasing Array</a></h2><h3>Difficulty Level: Easy</h3><hr><p class="pf0"><span style="font-size: 14pt;"><span class="cf0">Given an array <strong>arr[]</strong> that <strong>strictly decreases</strong> and then <strong>strictly increases</strong>, the array is said to be V-shaped or unimodal. </span><span class="cf0">Find the <strong>index </strong>of the <strong>minimum</strong> element present in the array.</span></span></p>
<p class="pf0"><strong><span style="font-size: 14pt;"><span class="cf0">Examples:</span></span></strong></p>
<pre class="pf0"><strong><span style="font-size: 14pt;"><span class="cf0">Input:</span></span></strong> <span style="font-size: 14pt;">arr[] = [9, 7, 5, 2, 4, 6, 10]</span><strong><span style="font-size: 14pt;"><span class="cf0"><br></span></span></strong><strong><span style="font-size: 14pt;"><span class="cf0">Output: </span></span></strong><span style="font-size: 14pt;"><span class="cf0">3</span></span><strong><span style="font-size: 14pt;"><span class="cf0"><br>Explanation: </span></span></strong><span style="font-size: 14pt;">The minimum of the given array is 2, which is at index 3.</span></pre>
<pre><strong><span style="font-size: 14pt;"><span class="cf0">Input:<span style="font-size: 14pt;"> </span></span></span></strong><span style="font-size: 14pt;">arr[] = [10, 8, 6, 5, 2, 12, 14]</span><strong><span style="font-size: 14pt;"><span class="cf0"><br></span></span></strong><strong><span style="font-size: 14pt;"><span class="cf0">Output: </span></span></strong><span style="font-size: 14pt;"><span class="cf0">4</span></span><strong><span style="font-size: 14pt;"><span class="cf0"><br>Explanation: </span></span></strong><span style="font-size: 14pt;">The minimum of the given array is 2, which is at index 4.</span></pre>
<p><strong><span style="font-size: 14pt;">Constraint:</span></strong><span style="font-size: 14pt;"><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>6</sup></span></p>