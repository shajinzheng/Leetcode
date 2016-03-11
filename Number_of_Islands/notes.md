### <center>[Leetcode - Number of Islands](https://leetcode.com/problems/number-of-islands/) </center>

#### Basic Idea
Using BFS or DFS to find separated regions. A region could be discovered by performing BFS or DFS from a random point inside it.

#### Mistakes
* Almost forgot to consider border;
* Corner case, when input array is emtpy. Do not get the number of rows and the number of columns at the same time;
* [Java short circuit evaluation](http://users.drew.edu/bburd/JavaForDummies4/ShortCircuitEval.pdf) && and || are short circuit; & and | are not;
* When performing BFS, be careful with when to set the node to be visited. It should be right after you put it into the queue. Tagging it after poping does not work. For example,  
	
		1000
		1111  
	  	1111 
	(2, 1) -> (2, 2), (3, 1)  
	(2, 2) -> (3, 2); (3, 1) -> (3, 2)
* Initializing a queue:

		Queue<Integer> q = new LinkedList();
		Queue<Integer> q = new LinkedList<Integer>();

#### Tricky Points
Very straitforward.


#### Reference
* [Sample Code 1 - DFS](https://leetcode.com/discuss/34436/very-concise-java-ac-solution)
* [Sample Code 2 - BFS] (https://leetcode.com/discuss/41053/java-dfs-and-bfs-solution)