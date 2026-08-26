# Count Substrings With K 1's

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-of-substrings-containing-k-ones2304/1)

## Solved On
26 Aug 2026 at 10:18 am

<h2><a href="https://www.geeksforgeeks.org/problems/count-of-substrings-containing-k-ones2304/1">Count Substrings With K 1's</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 20px;">Given a binary string<strong> s</strong> and an integer <strong>k</strong>, return the number of substrings of s that contain exactly <strong>k ones</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "10010", k = 1
<strong>Output:</strong> 9
<strong>Explanation:</strong> The 9 substrings containing one 1 are, "1", "10", "100", "001", "01", "1", "10", "0010" and "010".</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = 111, k = 2 
<strong>Output:</strong> 2 
<strong>Explanation:</strong> The 2 substrings containing two 1 are "11", "11".</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 6 * 10<sup>4</sup><br>0 ≤ k ≤ n<br>s[i] = '1' or s[i] = '0'</span></p>