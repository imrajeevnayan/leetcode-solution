# Print Pattern

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/print-pattern3549/1)

## Solved On
07 Sept 2026 at 10:55 am

<h2><a href="https://www.geeksforgeeks.org/problems/print-pattern3549/1">Print Pattern</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><span style="color: rgba(0, 0, 0, 0.87); background-color: #ffffff;">Given a number <strong>n</strong>, print a <strong>sequence of numbers</strong> starting from <strong>n</strong>. Each next number in the sequence is <strong>n - 5</strong>, and this continues recursively until the number becomes <strong>less than</strong> or <strong>equal to 0</strong>. After that, print the sequence in reverse order, <strong>adding 5</strong> each time, until it reaches back to the original number <strong>n</strong>.<br><strong>Note:</strong> You must not use loops.</span></span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = -16
<strong>Output:</strong> [-16]
<strong>Explanation:</strong> Since -16 is less than zero so it will remain same.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 10
<strong>Output: [</strong>10, 5, 0, 5, 10]
<strong>Explanation:</strong> </span><span style="font-size: 14pt;">The value decreases until it is greater or equal to 0. After that it increases and stops when it becomes 10 again.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>-10<sup>5</sup> ≤ n ≤ 10<sup>5</sup></span></p>