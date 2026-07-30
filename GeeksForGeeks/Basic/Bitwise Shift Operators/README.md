# Bitwise Shift Operators

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/bitwise-right-shift/1?page=1&status=unsolved&sortBy=accuracy)

## Solved On
30 Jul 2026 at 04:34 pm

<h2><a href="https://www.geeksforgeeks.org/problems/bitwise-right-shift/1?page=1&status=unsolved&sortBy=accuracy">Bitwise Shift Operators</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px;">Given two positive integers <strong>a</strong> and <strong>b</strong>, perform a <strong data-path-to-node="3" data-index-in-node="47">right bitwise shift</strong> of a by b positions, followed by a <strong data-path-to-node="3" data-index-in-node="102">left bitwise shift</strong> of a by b positions. Print both results separated by a space, </span><span style="font-size: 18px;">followed by</span><span style="font-size: 18px;"> new line</span><span style="font-size: 18px;">.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a = 5, b = 2
<strong>Output:</strong> 1 20
<strong>Explanation</strong>: 5 in binary is 101. Shifting right by 2 gives 001, which equals 1. Shifting left by 2 gives 10100, which equals 20.</span> </pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a = 4, b = 1
<strong>Output:</strong> 2 8
<strong>Explanation</strong>:<span style="font-size: 14pt;"> 4</span></span><span style="font-size: 14pt;"> in binary is 100. Shifting right by 1 gives 010, which equals 2. Shifting left by 1 gives 1000, which equals 8.</span> </pre>
<p><strong><span style="font-size: 14pt;">Constraints:<br></span></strong><span style="font-size: 14pt;">1&nbsp;<span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span>&nbsp;a&nbsp;<span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span>&nbsp;100<br>1&nbsp;<span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span>&nbsp;b&nbsp;<span style="color: #273239; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤</span>&nbsp;10</span></p>