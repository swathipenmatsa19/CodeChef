/*

If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

Input
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the sum of first and last digits of N in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
3 
1234
124894
242323

Output
5
5
5

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
        int last = n % 10;
        int first = 0;
        while(n != 0) {
            first = n % 10; 
            n = n / 10;   
        }
        System.out.println(first + last);
        }	// your code goes here
	}
}
