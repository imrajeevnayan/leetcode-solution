# Longest Balanced Substring

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/longest-even-length-substring--113837/1?page=4&category=Strings&sortBy=accuracy)

## Solved On
12 Jul 2026 at 04:43 pm

<h2><a href="https://www.geeksforgeeks.org/problems/longest-even-length-substring--113837/1?page=4&category=Strings&sortBy=accuracy">Longest Balanced Substring</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given a string <strong>s</strong> consisting only of digits, find the length of the <strong>longest substring</strong> of&nbsp; length <strong>2k</strong> (where k ≥ 1) such that the sum of left k digits is equal to the sum of right k digits.</span></p>
<p><span style="font-size: 18.6667px;">If no such valid substring exists, return <strong>0</strong>.</span></p>
<p><span style="font-size: 14pt;"><span style="font-size: 12pt;"><strong style="font-size: 18px;">Examples:</strong></span></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "1234123"<br><strong>Output:</strong> 4
<strong>Explanation:</strong> The v</span><span style="font-size: 18.6667px;">alid substring is s[1..4] = "2341", where the first half "23" has sum 5 and the second half "41" also has sum 5. Therefore, the length of the longest valid substring is 4.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "0000000"<br><strong>Output:</strong> 6
<strong>Explanation:<span style="font-size: 14pt;"> </span></strong></span><span style="font-size: 18.6667px;">The valid substring is s[0..5] = "000000", where both halves "000" have a sum of 0. Therefore, the length of the longest valid substring is 6.</span></pre>
<p><strong style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Constraints:<br></strong><span style="font-size: 14pt;">1 ≤ s.size() </span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> 2000<br>s consists only of digits from '0' to '9'.</span></p>