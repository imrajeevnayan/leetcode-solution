# Max Profit with Money Exchange using n/2, n/3, and n/4

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/ritikas-money4334/1?page=2&category=Dynamic%20Programming)

## Solved On
14 Aug 2026 at 11:22 pm

<h2><a href="https://www.geeksforgeeks.org/problems/ritikas-money4334/1?page=2&category=Dynamic%20Programming">Max Profit with Money Exchange using n/2, n/3, and n/4</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Ritika has a coin worth <strong>n</strong> dollars.&nbsp; she can exchange any coin worth <strong>n</strong> at the bank into three separate coins worth n/2, n/3, and n/4 (each value rounded down, i.e., integer division). She keeps exchanging coins wherever it results in profit. </span></p>
<p><span style="font-size: 18px;">Find the maximum total amount of money Ritika can end up with.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 5<strong>
Output: </strong>5<strong>
Explanation: </strong>5 =&gt; 5 / 2 + 5 / 3 + 5 / 4 = 2 + 1 + 1 = 4 (&lt; 5), so exchanging gives a loss. <br>Hence, the maximum amount she can have is 5 itself (no exchange).</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 12
<strong>Output</strong>: 13
<strong>Explanation</strong>: 12 =&gt; 12 / 2 + 12 / 3 + 12 / 4 = 6 + 4 + 3 = 13 (&gt; 12), so she exchanges. <br>None of 6, 4, or 3 can be exchanged further for profit. <br>Hence, the maximum amount is 13.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>8</sup></span></p>