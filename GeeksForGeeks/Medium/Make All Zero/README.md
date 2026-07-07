# Make All Zero

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/make-all-zero--150104/1?page=2&status=unsolved&sortBy=latest)

## Solved On
07 Jul 2026 at 08:58 pm

<h2><a href="https://www.geeksforgeeks.org/problems/make-all-zero--150104/1?page=2&status=unsolved&sortBy=latest">Make All Zero</a></h2><h3>Difficulty Level: Medium</h3><hr><p class="" data-start="210" data-end="358"><span style="font-size: 14pt;">Two players are playing a game involving energy stacks. Each stack contains a certain number of energy crystals represented as integers in an array <strong>arr[]</strong>.</span></p>
<p class="" data-start="360" data-end="515"><span style="font-size: 14pt;">Players take <strong data-start="373" data-end="382">turns</strong>. On each turn, a player must <strong data-start="412" data-end="439">remove one entire stack</strong> (i.e., remove one element from the array). However, there's a special rule:</span></p>
<ul data-start="517" data-end="631">
<li class="" data-start="517" data-end="631"><span style="font-size: 14pt;"> </span>
<p class="" data-start="519" data-end="631"><span style="font-size: 14pt;">If the <strong data-start="526" data-end="541">bitwise XOR</strong> of the entire array is <strong data-start="565" data-end="593">0 before a player's turn</strong>, then that player <strong data-start="612" data-end="630">instantly wins</strong>.</span></p>
<span style="font-size: 14pt;"> </span></li>
</ul>
<p class="" data-start="633" data-end="784"><span style="font-size: 14pt;">If it's not zero, they must remove one stack. The game continues until someone wins either due to the XOR rule or because the other player cannot move.</span></p>
<p class="" data-start="895" data-end="948"><span style="font-size: 14pt;"> </span></p>
<p class="" data-start="786" data-end="883"><span style="font-size: 14pt;">Both players play optimally. You need to determine who will win for each initial array of stacks.</span></p>
<p class="" data-start="786" data-end="883"><span style="font-size: 14pt;">Return <strong>true</strong> if Player second wins.</span></p>
<p class="" data-start="115" data-end="226"><strong style="font-size: 14pt;">Examples:</strong></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3]
<strong>Output: </strong>false<br><strong>Explanation: </strong>Since XOR of the entire array is 0 before player 1's turn, player 1 wins.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 4]<br><strong>Output: </strong>true<br></span><span style="font-size: 14pt;"><strong>Explanation: </strong>Player1 removes 1 from arr[] on his turn, then player2 removes 2 from arr[], then player1 removes 4 which makes Bitwise XOR of arr[] as 0. Hence player2 wins.<br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>8</sup></span></p>