/*


Write a program, which takes an integer N and if the number is less than 10 then display "Thanks for helping Chef!" otherwise print "-1".

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, output the given string or -1 depending on conditions, in a new line.

Constraints
1 ≤ T ≤ 1000
-20 ≤ N ≤ 20
Example
Input
3 
1
12
-5
Output
Thanks for helping Chef!
-1
Thanks for helping Chef!



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
            int n = sc.nextInt();
            if(n < 10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }// your code goes here
	}
}







