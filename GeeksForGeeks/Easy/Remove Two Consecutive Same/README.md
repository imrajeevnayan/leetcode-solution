# Remove Two Consecutive Same

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/string-manipulation3706/1?page=1&category=Stack&sortBy=difficulty)

## Solved On
30 May 2026 at 01:59 am

<h2><a href="https://www.geeksforgeeks.org/problems/string-manipulation3706/1?page=1&category=Stack&sortBy=difficulty">Remove Two Consecutive Same</a></h2><h3>Difficulty Level: Easy</h3><hr><div class="starwars-lab">
<p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">Tom is a string freak. He has got sequences of words <strong>arr[]</strong> to manipulate. If in a sequence, two same words come together then Tom destroys each other. Find the number of words left in the sequence after this pairwise destruction.</span></span>&nbsp;</p>
<div class="starwars-lab">
<p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Examples:</strong></span></span></p>
<pre><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Input: </strong>arr[] = ["ab", "aa", "aa", "bcd", "ab"]
<strong>Output: </strong>3<strong>
Explanation: </strong>After the first iteration, we'll have: ab bcd ab. We can't further destroy more strings and hence we stop and the result is 3. </span></span></pre>
<pre><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Input: </strong>arr[] = ["tom", "jerry", "jerry", "tom"]
<strong>Output: </strong>0
<strong>Explanation: </strong>After the first iteration, we'll have: tom tom. After the second iteration: 'empty-array' .Hence, the result is 0.</span></span></pre>
</div>
<p><span style="font-size: 14pt;"><span style="font-family: arial, helvetica, sans-serif;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤10<sup>6</sup><br>1 ≤ |arr<sub>i</sub>| ≤ 50</span></span></p>
</div>