# Coin Change (Count Ways)

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/coin-change2448/1)

## Solved On
22 May 2026 at 04:22 pm

<h2><a href="https://www.geeksforgeeks.org/problems/coin-change2448/1">Coin Change (Count Ways)</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an integer&nbsp;array&nbsp;<strong>coins[ ]</strong><strong>&nbsp;</strong>representing different denominations of currency and an integer&nbsp;<strong>sum</strong>, find the number of ways you can make&nbsp;<strong>sum</strong>&nbsp;by using different combinations from coins[ ].&nbsp;<br><strong>Note:</strong>&nbsp;Assume that you have an <strong>infinite</strong> supply of each type of coin. Therefore, you can use any coin as many times as you want.<br>Answers are guaranteed to fit into a 32-bit integer.&nbsp;</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>coins[] = [1, 2, 3], sum = 4
<strong>Output:</strong> 4
<strong>Explanation</strong>: Four Possible ways are: [1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3].
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: coins[] = [2, 5, 3, 6], sum = 10
<strong>Output:</strong> 5
<strong>Explanation</strong>: Five Possible ways are: [2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5].<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: coins[] = [5, 10], sum = 3
<strong>Output:</strong> 0<br><strong>Explanation:</strong> Since all coin denominations are greater than sum, no combination can make the target sum.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= sum &lt;= 10<sup>3</sup><br>1 &lt;= coins[i] &lt;= 10<sup>4</sup><sup><br></sup></span><span style="font-size: 14pt;">1 &lt;= coins.size() &lt;=&nbsp;</span><span style="font-size: 18.6667px;">10</span><sup>3</sup></p>