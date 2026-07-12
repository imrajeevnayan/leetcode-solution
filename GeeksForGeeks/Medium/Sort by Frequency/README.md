# Sort by Frequency

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sort-string-according-to-increasing-frequency/1?page=2&category=Strings&sortBy=accuracy)

## Solved On
12 Jul 2026 at 04:59 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sort-string-according-to-increasing-frequency/1?page=2&category=Strings&sortBy=accuracy">Sort by Frequency</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="color: #273932; font-family: Nunito, serif;"><span style="font-size: 18px; letter-spacing: 0.21px;">Given a string <strong>s</strong>, the task is to <strong>arrange</strong> the string according to the <strong>frequency</strong> of each character, in ascending order. If two elements have the <strong>same</strong> frequency, then they are sorted in <strong>lexicographical</strong> order.</span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s =<strong> </strong>"geeksforgeeks"</span><br><span style="font-size: 14pt;"><strong>Output:</strong> forggkksseeee</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> All the characters with minimum frequency will occur first and the one with same frequency will be arranged lexicographically.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s =<strong>&nbsp;</strong>"abc"</span><br><span style="font-size: 14pt;"><strong>Output:</strong> abc</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> The frequency is one for all characters hence they'll be arranged lexicographically.</span></pre>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Constraints :<br></strong><span style="font-size: 14pt;">1 </span><span style="color: #001d35; font-family: 'Google Sans', Arial, sans-serif; background-color: #ffffff;">≤ </span><span style="font-size: 14pt;">s.length()</span><strong style="font-size: 14pt;">&nbsp;</strong><span style="background-color: #ffffff; color: #001d35; font-family: 'Google Sans', Arial, sans-serif;"><span style="font-size: 14pt;">≤ 10<sup>6</sup><br></span>s consist of lowercase english alphabets.</span></span></p>