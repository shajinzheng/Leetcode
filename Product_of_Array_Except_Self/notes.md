### <center>[Leetcode - Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) </center>

#### Basic Idea
O(n) means you can only loop throught the array several times. When you loop from left to right, you can only get the mulplication of elements on your left. So you need to loop in the opposite direction to get the multiplication of all the elements on your right. But of course, leave yourself alone.

#### Mistakes
There are two naiive ways. One is to use division. The other is O(n^2) time complexity.

Then when I wanted to find better solution, I was stuck on how to use hashmap or kind of strategies to solve this problem. But it was the wrong direction.

#### Tricky Points
* Looping the array two times solve the problem. One from left to right; the other from right to left.


#### Reference
* [Sample Code 1](https://leetcode.com/discuss/46104/simple-java-solution-in-o-n-without-extra-space)