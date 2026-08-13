# K-Pangrams

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/k-pangrams0909/1?page=2&category=Hash)

## Solved On
13 Aug 2026 at 10:53 pm

<h2><a href="https://www.geeksforgeeks.org/problems/k-pangrams0909/1?page=2&category=Hash">K-Pangrams</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-start="126" data-end="283"><span style="font-size: 14pt;">Given a string <code data-start="141" data-end="146">str</code> and an integer <code data-start="162" data-end="165">k</code>, return <strong data-start="174" data-end="182">true</strong> if the string can be changed into a <strong data-start="219" data-end="230">pangram</strong> after at most <code data-start="245" data-end="248">k</code> operations, else return <strong data-start="273" data-end="282">false</strong>.&nbsp; A panagram consists of all 26 lowercase English alphabet caharaters at least once.</span></p>
<ul>
<li data-start="126" data-end="283"><span style="font-size: 18.6667px;">The string may contain duplicate characters.&nbsp;</span></li>
<li data-start="126" data-end="283"><span style="font-size: 14pt;">A single operation consists of swapping an existing alphabetic character with any other lowercase alphabetic character or spaces.</span></li>
</ul>
<p><span style="font-size: 14pt;"> </span></p>
<p data-start="406" data-end="488"><span style="font-size: 14pt;"><strong data-start="406" data-end="414">Note</strong>: A pangram is a sentence containing every letter in the English alphabet.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>str = "the quick brown fox jumps over the lazy dog", k = 0
<strong>Output: </strong>true
<strong>Explanation:</strong> the sentence contains all 26 characters and is already a pangram.</span></pre>
<pre><strong style="font-size: 18px;">Input:</strong><span style="font-size: 18px;"> str = "aaaaaaaaaaaaaaaaaaaaaaaaaa", k = 25&nbsp;<br></span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> true<br></span><strong style="font-size: 18px;">Explanation:&nbsp;</strong><span style="font-size: 18px;">The word contains 26 instances of 'a'. Since only 25 operations are allowed. We can keep 1 instance and change all others to make str a pangram.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> str = "a b c d e f g h i j k l m", k = 20</span><br><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> false<br></span><span style="font-size: 18.6667px;"><strong>Explanation: </strong>Since there are only 13 </span></span>alphabetic <span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">characters in this case, no amount of swapping can produce a panagram here.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ str.size() ≤ 10<sup>5</sup><br>0 ≤ k ≤ 50<br></span></p>