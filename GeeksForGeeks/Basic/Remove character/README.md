# Remove character

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/remove-character3815/1?page=4&category=Strings&sortBy=accuracy)

## Solved On
12 Jul 2026 at 04:44 pm

<h2><a href="https://www.geeksforgeeks.org/problems/remove-character3815/1?page=4&category=Strings&sortBy=accuracy">Remove character</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 18px;">Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.</span><br><strong><span style="font-size: 18px;">NOTE: </span></strong><span style="font-size: 18px;">Size of</span><span style="font-size: 18px;"><span style="box-sizing: border-box; margin: 0px; padding: 0px;"> the&nbsp;</span>first string&nbsp;is always greater than the size of</span><span style="font-size: 18px;"><span style="box-sizing: border-box; margin: 0px; padding: 0px;"> the&nbsp;</span>second string( |str1| &gt; |str2|).</span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; white-space: normal;">str1 </span>= "computer", <span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; white-space: normal;">str2</span>= "cat"
<strong>Output:</strong> "ompuer"
<strong>Explanation: </strong>After removing characters(c, a, t) from string1 we get "ompuer"</span><span style="font-size: 18px;">.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; white-space: normal;">str1 </span>= "occurrence</span><span style="font-size: 18px;">", <span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; white-space: normal;">str2 </span>= "car"
<strong>Output:</strong> "ouene"
<strong>Explanation: </strong>After removing characters (c, a, r) from string1 we get "ouene"</span><span style="font-size: 18px;">.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= |Str1| , |Str2| &lt;= 50</span></p>