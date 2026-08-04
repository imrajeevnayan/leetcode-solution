# Removing K Consecutive Identical

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1?page=3&category=Stack)

## Solved On
04 Aug 2026 at 10:14 pm

<h2><a href="https://www.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1?page=3&category=Stack">Removing K Consecutive Identical</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given a string <strong>s</strong>&nbsp;and an integer <strong>k</strong>, the task is to reduce the string by removing k consecutive identical characters.&nbsp;</span><span style="font-size: 18px;">The removal operation can be performed any number of times until it is no longer possible.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s = "geeksforgeeks"
<strong>Output: </strong>gksforgks
<strong>Explanation: </strong>Modified String after each step: 
<strong>"</strong>g<strong>ee</strong>ksforg<strong>ee</strong>ks" -&gt; "gksforgks"</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s =<strong> "</strong>geegsforgeeeks" 
<strong>Output: </strong>sforgeks
<strong>Explanation: </strong>Modified String after each step:
<strong>"</strong>g<strong>ee</strong>gsforg<strong>eee</strong>ks" -&gt; "<strong>gg</strong>sforgeks" -&gt; "sforgeks"</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s =<strong> "</strong>abbac" 
<strong>Output: </strong>c</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup><br>1&nbsp;≤ k&nbsp;≤ |s|</span></p>