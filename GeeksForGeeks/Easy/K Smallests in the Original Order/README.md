# K Smallests in the Original Order

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/print-k-smallest-elements-in-their-original-order5407/1?page=3&category=Hash)

## Solved On
09 Aug 2026 at 10:46 pm

<h2><a href="https://www.geeksforgeeks.org/problems/print-k-smallest-elements-in-their-original-order5407/1?page=3&category=Hash">K Smallests in the Original Order</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given an array, the task is to print <strong>k</strong> smallest elements from the array but they must be in the same order as they are in a given array.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 2, 2, 3, 1], k = 3
<strong>Output:</strong> 1 2 1
<strong>Explanation: </strong>After sorting the array, we get [1, 1, 2, 2, 3]. The 3 smallest elements are 1, 1, and 2. <br>Now, we traverse the original array and pick these elements while preserving their original order. <br>Thus, the result is [1, 2, 1].</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input :</strong> arr[] = [9, 4, 3, 3, 5, 5], k = 1<strong>
Output :</strong> 3<br><strong>Explanation:</strong> The smallest element in the array is 3. <br>Since k = 1, we only need the smallest element, so the answer is [3].</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ k ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>9</sup></span></p>