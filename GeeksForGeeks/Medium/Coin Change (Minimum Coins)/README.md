# Coin Change (Minimum Coins)

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/number-of-coins1824/1?sortBy=submissions&category%5B%5D=Dynamic%2520Programming&page=1&difficulty%5B%5D=1)

## Solved On
24 May 2026 at 05:18 pm

<h2><a href="https://www.geeksforgeeks.org/problems/number-of-coins1824/1?sortBy=submissions&category%5B%5D=Dynamic%2520Programming&page=1&difficulty%5B%5D=1">Coin Change (Minimum Coins)</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">You are given an array <strong>coins[]</strong>, where each element represents a coin of a <strong>different</strong> denomination, and a target value <strong>sum</strong>. </span><span style="font-size: 18.6667px;">You have an <strong>unlimited</strong> supply of each coin type.&nbsp;</span><span style="font-size: 18.6667px;">Your task is to determine the <strong>minimum</strong> number of coins needed to obtain the target <strong>sum</strong>. If it is <strong>not</strong> possible to form the sum using the given coins, return <strong>-1</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre dir="ltr" style="color: #222222; font-family: Arial, Helvetica, sans-serif; font-size: small; white-space: normal; background-color: #ffffff;"><span style="font-size: 14pt;"><strong>Input:</strong>&nbsp;coins[] = [25, 10, 5], sum = 30</span><br><span style="font-size: 14pt;"><strong>Output:</strong>&nbsp;2</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong>&nbsp;Minimum 2 coins needed, 25 and 5 &nbsp;</span></pre>
<pre dir="ltr" style="color: #222222; font-family: Arial, Helvetica, sans-serif; font-size: small; white-space: normal; background-color: #ffffff;"><span style="font-size: 14pt;"><strong>Input:</strong>&nbsp;coins[] = [9, 6, 5, 1], sum = 19</span><br><span style="font-size: 14pt;"><strong>Output:&nbsp;</strong>3</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong>&nbsp;19 = 9 + 9 + 1</span></pre>
<pre dir="ltr" style="color: #222222; font-family: Arial, Helvetica, sans-serif; font-size: small; white-space: normal; background-color: #ffffff;"><span style="font-size: 14pt;"><strong>Input:</strong>&nbsp;coins[] = [5, 1], sum = 0</span><br><span style="font-size: 14pt;"><strong>Output:&nbsp;</strong>0</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong>&nbsp;For 0 sum, we do not need a coin</span></pre>
<pre dir="ltr" style="color: #222222; font-family: Arial, Helvetica, sans-serif; font-size: small; white-space: normal; background-color: #ffffff;"><span style="font-size: 14pt;"><strong>Input:</strong>&nbsp;coins[] = [4, 6, 2], sum = 5</span><br><span style="font-size: 14pt;"><strong>Output:&nbsp;</strong>-1</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong>&nbsp;Not possible to make the given sum.</span></pre>
<div><strong style="font-size: 14pt;">Constraints:</strong></div>
<div><span style="font-size: 14pt;">1 ≤ sum * coins.size() ≤ 10<sup>6</sup></span></div>
<div><span style="font-size: 14pt;">0 ≤ sum ≤ 10<sup>4</sup></span></div>
<div><span style="font-size: 14pt;">1 ≤ coins[i] ≤ 10<sup>4</sup></span></div>
<div><span style="font-size: 14pt;">1 ≤ coins.size() ≤ 10<sup>3</sup></span></div>