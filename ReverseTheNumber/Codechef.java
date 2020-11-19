/*

Given an Integer N, write a program to reverse it.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the reverse of the given number N, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
4
12345
31203
2123
2300
Output
54321
30213
3212
32

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
           int rev = 0;
           while(n != 0) {
               int r = n % 10;
               rev = (rev * 10) + r;
               n = n / 10;
           }
           System.out.println(rev);
       }// your code goes here
	}
}









