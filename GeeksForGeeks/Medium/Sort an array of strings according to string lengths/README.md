# Sort an array of strings according to string lengths

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sort-an-array-of-strings-according-to-string-lengths/1?page=2&category=Strings&difficulty=Medium)

## Solved On
06 Aug 2026 at 12:31 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sort-an-array-of-strings-according-to-string-lengths/1?page=2&category=Strings&difficulty=Medium">Sort an array of strings according to string lengths</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">You are given an array <strong>arr[]</strong> of strings. Your have&nbsp; to <strong data-start="115" data-end="188">sort </strong>the array in <strong data-start="115" data-end="188">ascending </strong>order based on the<strong data-start="115" data-end="188"> lengths </strong>of the strings. If two strings have the same length, maintain their original <strong>relative order</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = ["GeeksforGeeeks", "I", "from", "am"]<br></span><span style="font-size: 14pt;"><strong>Output:&nbsp;</strong>["I", "am", "from", "GeeksforGeeks"]<br></span><span style="font-size: 14pt;"><strong>Explanation:&nbsp;</strong>The strings are sorted in increasing order of their lengths, starting from the shortest string "I" to the longest one "GeeksforGeeeks".</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = ["You", "are", "beautiful", "looking"]</span><br><span style="font-size: 14pt;"><strong>Output: </strong>[</span><span style="font-size: 14pt;">"You", "are", "looking", "beautiful"]</span><br><span style="font-size: 14pt;"><strong>Explanation:&nbsp;</strong>The strings are sorted by length: "You", "are", "looking", and then "beautiful", with the shortest words appearing first and the longest last.</span></pre>
<p data-pm-slice="0 0 []"><strong><span style="font-size: 14pt;">Constraints:<br></span></strong><span style="font-size: 14pt;">1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i].size() ≤ 100<br></span><span style="font-size: 14pt;">Each string in arr[i] contains only English letters.</span></p>