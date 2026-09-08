# Count Edges in Graph

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-number-of-edges-in-an-undirected-graph/1)

## Solved On
08 Sept 2026 at 07:00 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-number-of-edges-in-an-undirected-graph/1">Count Edges in Graph</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt; font-family: 'andale mono', monospace;">Given an undirected graph containing&nbsp;<strong data-start="226" data-end="231">V</strong>&nbsp;vertices from 0 to V-1, represented by a 2D adjacency list&nbsp;<strong data-start="276" data-end="287">adj[][]</strong>, where each&nbsp;adj[i]&nbsp;represents the list of vertices connected to vertex&nbsp;i. </span><span style="font-size: 14pt; font-family: 'andale mono', monospace;">Your task is to&nbsp;count&nbsp;the&nbsp;total number of edges&nbsp;present in the graph.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> adj[][] = [[1, 2], [0, 2], [0, 1, 3], [2]]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/913857/Web/Other/blobid0_1761566038.jpg" width="224" height="236"><br><strong>Output: </strong>4<strong>
Explanation: </strong><span style="font-family: 'andale mono', monospace;">The edges in the graph are: (0-1), (0-2), (2-3), (1-2). Hence, total number of edges = 4.</span><strong><br></strong></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>adj[][] = [[1], [0, 2], [1, 3], [2]]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/913857/Web/Other/blobid1_1761566117.jpg" width="225" height="237"><br><strong>Output: </strong>3<br><strong>Explanation: </strong>The edges in the graph are: (0-1), (1-2), (2-3). Hence, total number of edges = 3.<strong><br></strong></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 ≤ V = adj.size() ≤ 10<sup>4</sup><br>0 ≤ adj[i][j] &lt; V</span></p>