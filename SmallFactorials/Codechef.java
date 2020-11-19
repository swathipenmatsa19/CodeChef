/*

You are asked to calculate factorials of some small positive integers.

Input
An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output
For each integer n given at input, display a line with the value of n!

Example
Sample input:
4
1
2
5
3
Sample output:

1
2
120
6

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
        }// your code goes here
	}
}









