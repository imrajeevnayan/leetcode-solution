# k-Anagram

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1?page=3&category=Strings&difficulty=Medium)

## Solved On
06 Aug 2026 at 12:32 pm

<h2><a href="https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1?page=3&category=Strings&difficulty=Medium">k-Anagram</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;"><span>Given two strings <strong>s1</strong> and <strong>s2</strong> consisting of lowercase English alphabets, and an integer value <strong>k</strong>, </span><span>return <strong>true</strong> if two strings are k-anagrams of each other. Otherwise, return <strong>false</strong>.</span></span></p>
<p><span style="font-size: 18px;">Two strings are called k-anagrams&nbsp;if<strong>&nbsp;</strong>both of the below<strong>&nbsp;</strong>conditions are true.</span></p>
<ol>
<li><span style="font-size: 18px;">Both have same<strong>&nbsp;</strong>number of characters.</span></li>
<li><span style="font-size: 18px;">Two strings can become anagram by changing<strong>&nbsp;</strong>at most&nbsp;k&nbsp;characters in a string.</span></li>
</ol>
<p><span style="font-size: 20px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "fodr</span><span style="font-size: 18px;">", s2 = "gork", k = 2</span>
<span style="font-size: 18px;"><strong>Output: </strong>true</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>We can change 'f' -&gt; 'g' and 'd' -&gt; 'k' in <strong>s1</strong>.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "geeks</span><span style="font-size: 18px;">", s2 = "eggkf", k = 1</span>
<span style="font-size: 18px;"><strong>Output: </strong>false</span>
<span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">We can update or modify only 1 value but there is a need of modifying 2 characters i.e. 'g' and 'f' in <strong>s2</strong>.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "adb</span><span style="font-size: 18px;">", s2 = "fdab", k = 2</span>
<span style="font-size: 18px;"><strong>Output: </strong>false</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>Both the strings have different numbers of characters.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s1.size(), s2.size() ≤ 10<sup>5</sup><br>1 ≤ k ≤ 10<sup>5</sup></span></p>