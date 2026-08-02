# Make all Substrings Distinct

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/minimum-changes-to-make-all-substrings-distinct4722/1?page=3&category=Strings&sortBy=accuracy)

## Solved On
02 Aug 2026 at 04:45 pm

<h2><a href="https://www.geeksforgeeks.org/problems/minimum-changes-to-make-all-substrings-distinct4722/1?page=3&category=Strings&sortBy=accuracy">Make all Substrings Distinct</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given a string <strong>s</strong> consisting of lowercase English letters, determine the<strong> minimum number of character</strong> modifications required so that every substring of the resulting string is <strong>unique</strong>.</span></p>
<p><span style="font-size: 18px;">A modification consists of replacing any character with another lowercase English letter.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "aab"
<strong>Output:</strong> 1
<strong>Explanation</strong>: By changing one occurrence of 'a' to a different letter, the string can be transformed into "acb", where all the substrings are distinct.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s = "ab"
<strong>Output:</strong> 0
<strong>Explanation</strong>: All substrings of "ab" are: "a", "b", and "ab". Since every substring is distinct, no modifications are required.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 26</span></p>