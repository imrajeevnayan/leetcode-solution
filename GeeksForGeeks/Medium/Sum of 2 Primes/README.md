# Sum of 2 Primes

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/sum-of-prime4751/1?page=2&category=Arrays&difficulty=Medium)

## Solved On
03 Aug 2026 at 10:39 pm

<h2><a href="https://www.geeksforgeeks.org/problems/sum-of-prime4751/1?page=2&category=Arrays&difficulty=Medium">Sum of 2 Primes</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;"><span style="font-size: 18px;">Given a number <strong>n</strong>, determine whether it can be expressed as <strong>a + b</strong>, where both <strong>a </strong>and <strong>b </strong>are <strong>prime numbers</strong>. If such a pair exists, return the pair <strong>(a, b)</strong> such that a ≤ b. If multiple pairs are possible, return the pair with the smallest value of a. If no such pair exists, return <strong>[-1, -1]</strong>.</span><br></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">n = 10</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong>[</span><span style="font-size: 18px;">3 7]</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong>There are two possiblities 3, 7 &amp; 5, 5</span><span style="font-size: 18px;"> are both prime &amp; their sum is 10, but we'll pick 3, 7 as 3 &lt; 5.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">n = 3</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong>[</span><span style="font-size: 18px;">-1 -1]</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">There are no solutions to the number 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">2 &lt;= n &lt;= 10<sup>6</sup></span></p>