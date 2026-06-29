# Count the number of possible triangles

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1?utm_source=chatgpt.com)

## Solved On
29 Jun 2026 at 09:07 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1?utm_source=chatgpt.com">Count the number of possible triangles</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an integer array <strong>arr[]</strong>. Find the <strong>number</strong> of triangles that can be formed with <strong>three </strong>different array elements as lengths of three sides of the triangle. </span><span style="font-size: 18px;">A triangle with three given sides is only possible if sum of any two sides is always <strong>greater </strong>than the third side.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [4, 6, 3, 7]
<strong>Output</strong>: 3
<strong>Explanation</strong>: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  <br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [10, 21, 22, 100, 101, 200, 300]
<strong>Output</strong>: 6
<strong>Explanation</strong>: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300].</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [1, 2, 3]
<strong>Output</strong>: 0
<strong>Explanation</strong>: No triangles are possible.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>3</sup></span><br><span style="font-size: 18px;">0 ≤ arr[i] ≤ 10</span><sup>5</sup></p>