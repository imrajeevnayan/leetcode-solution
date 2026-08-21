# Nearest Smaller Value

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/nearest-smaller-tower--170647/1)

## Solved On
21 Aug 2026 at 02:40 pm

<h2><a href="https://www.geeksforgeeks.org/problems/nearest-smaller-tower--170647/1">Nearest Smaller Value</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array where each element <strong>arr[i]</strong> represents the height of the tower. Find for each tower, the nearest possible tower that is shorter than it. You can look left or right on both sides.</span></p>
<ul>
<li>
<p><span style="font-size: 18px;">If two smaller towers are at the same distance, pick the smallest tower.&nbsp;</span></p>
</li>
<li>
<p><span style="font-size: 18px;">If two towers have the same height then we choose the one with a smaller index.</span></p>
</li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 3, 2]</span>
<span style="font-size: 18px;"><strong>Output: </strong>[-1, 0, 0] </span>
<strong><span style="font-size: 18px;">Explanation:</span></strong>
<span style="font-size: 18px;">For <strong>0th</strong> index : no tower is smallest, so <strong>-1</strong>.
For <strong>1st</strong> index : For 3, here 1 &amp; 2 both are small &amp; at a same distance, we pick smallest which is 1 
For <strong>2nd</strong> Index : 1 is smaller, so <strong>0(index)</strong></span></pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = [4, 8, 3, 5, 3]</span><strong><span style="font-size: 18px;"><br>Output =</span></strong><span style="font-size: 18px;"> [2, 2, -1, 2, -1]</span>
<strong><span style="font-size: 18px;">Explanation:</span></strong> 
<span style="font-size: 18px;">For <strong>0th</strong> index : here 3 is the smaller, so <strong>2(index)</strong> 
For <strong>1st</strong> index : For 8, here 4 &amp; 3 both are small &amp; at a same distance, we pick 3, so <strong>2(index)</strong>
For <strong>2nd</strong> index : no tower is smallest, so <strong>-1</strong>.
For <strong>3rd</strong> index : For 5, here 3 &amp; 3 both are small &amp; at a same distance, we pick <strong>3</strong>(2nd Index) it smaller Index, so <strong>2(index)
</strong>For <strong>4th</strong> index : no tower is smaller, so <strong>-1</strong>.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= n&lt;= 10<sup>5</sup><br>1 &lt;= arr[i]&nbsp;&lt;= 10<sup>5</sup></span></p>
<p>&nbsp;</p>