/*


Alice and Bob are playing a game. Alice initially has the number A and Bob has the number B. There are a total of N turns in the game, and Alice and Bob alternatively take turns. In each turn the player whose turn it is, multiplies his or her number by 2. Alice has the first turn.

Suppose after all the N turns, Alice's number has become C and Bob's number has become D. You want to calculate the integer division of the maximum number among C and D by the minimum number among C and D.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of each testcase follows.
Each test case contains a single line with 3 integers A, B, and N.
Output
For each test case output a new line with a single integer which should be the answer.

Constraints
1 ≤ T ≤ 100
1 ≤ A ≤ 1000000000
1 ≤ B ≤ 1000000000
1 ≤ N ≤ 1000000000
Subtasks
Subtask #1 (30 points): N ≤ 30
Subtask #2 (70 points): Original constraints
Example
Input:
3
1 2 1
3 2 3
3 7 2

Output:
1
3
2



*/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            if(n % 2 != 0) 
                a = a * 2;
        
            int max, min;
            if(a > b) {
                max = a;
                min = b;
            }
                
            else {
                max = b;
                min = a;
            }
            System.out.println(max/min);
            
        }// your code goes here
	}
}











