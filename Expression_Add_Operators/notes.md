### <center>[Leetcode - Expression Add Operators](https://leetcode.com/problems/expression-add-operators/) </center>

#### Basic Idea
Using backtracking to solve this problem recursively. At each recursion, consider three operators.

#### Mistakes
Firstly, based on the tag of the problem, I used `divide-and-conquer` to solve the problem. However, it turned out to be very complex since I did not find an easy way to handle the operator `*`. Then based on the reference answer, I ACed it.

#### Tricky Points
* overflow: Since numbers coule be very large, use long instead of int;
* 0 sequence: Numbers cannot start with zeros;
* multiplication: pass the last added number to next recursion to deal with multiplication. This works because we are parsing the numbers one by one.

#### Reference
* [Sample Code 1](https://leetcode.com/discuss/58614/java-standard-backtrace-ac-solutoin-short-and-clear)