/*

Write a program to find the factorial value of any number entered by the user.

Input
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains an integer N.

Output
For each test case, display the factorial of the given number N in a new line.

Constraints
1 ≤ T ≤ 1000
0 ≤ N ≤ 20
Example
Input
3 
3 
4
5

Output

6
24
120

*/


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for(int i = 2; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    System.out.println(factorial(n));
		}
		// your code goes here
	}
}












