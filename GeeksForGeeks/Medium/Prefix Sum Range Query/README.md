# Prefix Sum Range Query

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/prefix-sum-range-query/1?page=1&category=Arrays&difficulty=Medium&sortBy=accuracy)

## Solved On
31 Jul 2026 at 11:46 pm

<h2><a href="https://www.geeksforgeeks.org/problems/prefix-sum-range-query/1?page=1&category=Arrays&difficulty=Medium&sortBy=accuracy">Prefix Sum Range Query</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given an array <strong>arr[]</strong> of integers and a list of <strong>q</strong> queries <strong>queries[][]</strong>, where each query is in the form [L, R], compute the sum of elements from index L to R (both inclusive) for each query.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [2, 4, 6, 8, 10], queries[][] = [[1, 3], [0, 2]]<br></span><span style="font-size: 14pt;"><strong>Output:</strong> [18, 12]<br><strong>Explanation:</strong><br></span><span style="font-size: 14pt;">Query [1, 3] -&gt; 4 + 6 + 8 = 18</span><br><span style="font-size: 14pt;">Query [0, 2] -&gt; 2 + 4 + 6 = 12</span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [5, 1, 3, 2], queries[][] = [[0, 1], [2, 3]]<br></span><span style="font-size: 14pt;"><strong>Output:</strong> [6, 5]<br><strong>Explanation:</strong><br></span><span style="font-size: 18.6667px;">Query [0, 1] -&gt; 5 + 1 = 6
Query [2, 3] -&gt; 3 + 2 = 5</span></span></pre>
<p><strong></strong></p>