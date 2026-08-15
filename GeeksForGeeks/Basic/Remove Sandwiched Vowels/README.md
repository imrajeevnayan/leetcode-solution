# Remove Sandwiched Vowels

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sandwiched-vowels5158/1?page=2&category=Strings)

## Solved On
15 Aug 2026 at 02:32 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sandwiched-vowels5158/1?page=2&category=Strings">Remove Sandwiched Vowels</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px; font-family: 'andale mono', monospace;">Given string <strong>s </strong>containing<strong> </strong>only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants (sandwiched between two immediately adjacent consonants). Return the new string.</span></p>
<p><span style="font-size: 18px; font-family: 'andale mono', monospace;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px; font-family: 'andale mono', monospace;"><strong>Input :</strong> s = "bab"
<strong>Output :</strong> bb
<strong>Explanation: </strong>'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.</span></pre>
<pre><span style="font-size: 18px; font-family: 'andale mono', monospace;"><strong>Input :</strong> s = "ceghij"<br></span><span style="font-size: 18px; font-family: 'andale mono', monospace;"><strong>Output :</strong> cghj<br><strong>Explanation: </strong>'e' and 'i' are sandwitched vowels.</span></pre>
<p><span style="font-size: 18px; font-family: 'andale mono', monospace;"><strong>Constraints:<br></strong></span><span style="font-size: 18px; font-family: 'andale mono', monospace;">1 ≤ s.size() ≤ 10<sup>6</sup><sup><br></sup></span><span style="font-size: 18px; font-family: 'andale mono', monospace;">'a' ≤ s[i] ≤ 'z'</span></p>